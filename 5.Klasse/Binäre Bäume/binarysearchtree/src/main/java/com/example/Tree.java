package com.example;

public class Tree {
    Node root;

    public Tree(Node root) {
        this.root = root;
    }

    boolean delete(Node del) {
        /**
         * ----------------------------------------------------------------------------------
         **/
        // Sonderfälle:

        // nichts zum Löschen
        if (del == null)
            return false;

        // del ist Root
        if (del == this.root) {
            this.root = null;
            return true;
        }

        /**
         * ----------------------------------------------------------------------------------
         **/
        // einfacher Fall: del hat keinen Nachfolger
        if (del.right == null && del.left == null) {
            Node parent = getParent(del.key);
            if (parent.right == del) {
                parent.right = null;
                return true;
            } else {
                parent.left = null;
                return true;
            }
        }

        // einfacher Fall: del hat einen Nachfolger
        else if (del.right == null || del.left == null) {
            Node parent = getParent(del.key);
            if (parent.right == del) {
                if (del.right == null) {
                    parent.right = del.left;
                    return true;
                } else {
                    parent.right = del.right;
                    return true;
                }
            } else {
                if (del.right == null) {
                    parent.left = del.left;
                    return true;
                } else {
                    parent.left = del.right;
                    return true;
                }
            }
        }

        /**
         * ------------------- FUNKTIONIERT NED :(
         * ---------------------------------------------------------------
         **/
        // Allgemeiner Fall - Nicht zum Test nur theoretisch

        else {
            Node parent = getParent(del.key);
            Node maxLeft = max(del.left);
            Node maxLeftParent = getParent(maxLeft.key);

            if (parent.right == del) {
                maxLeft.left = del.left;
                maxLeft.right = del.right;
                parent.right = maxLeft;
                maxLeftParent.right = null;
                if (del.right == null) {
                    parent.right = del.left;
                    return true;
                }
                return true;
            } else {
                maxLeft.left = del.left;
                maxLeft.right = del.right;
                parent.left = maxLeft;
                maxLeftParent.right = null;
                return true;
            }
        }

    }

    boolean delete(int del) {
        return delete(findRec(del));
    }

    private Node getParent(Node r, Node n) {

        // Sonderfälle
        if (n == null) {
            return null;
        }

        // Kein parent
        if (n == this.root) {
            return null;
        }

        // Sonst
        if (r.left.key == n.key || r.right.key == n.key)
            return r;
        else if (n.key > r.key)
            return getParent(r.right, n);
        else
            return getParent(r.left, n);
    }

    public Node getParent(int key) {
        return getParent(root, new Node(key));
    }

    /**
     * ------------------------------- traverse Order
     * ---------------------------------------------------
     **/
    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.key + " ");
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node r) {

        if (r == null)
            return;

        traverseInOrder(r.left);
        System.out.print(r.key + " ");
        traverseInOrder(r.right);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root == null)
            return;

        traversePostOrder(root.left);
        traversePostOrder(root.right);
        System.out.print(root.key + " ");
    }

    /**
     * Höhe des Baumes
     * 
     * @param root
     * @return - Höhe des Baumes gesehen vom übergebenen Root (Standartmäßig ganzer Baum)
     */
    private int height(Node root) {
        // Abbruchbedingung
        if (root == null)
            return -1;

        // Höhe der einzelnen Subbäume
        int left = height(root.left);
        int right = height(root.right);

        // Höheren Baum ermitteln +1
        if (left < right) {
            return right + 1;
        } else {
            return left + 1;
        }

    }

    public int height() {
        return height(this.root);
    }

    /**
     * (iterativ) Minimum
     * 
     * @return Node mit kleinstem Wert
     */
    Node imin() {
        Node tmp = root;

        while (tmp != null) {
            if (tmp.left == null) {
                return tmp;
            } else {
                tmp = tmp.left;
            }
        }

        return null;
    }

    /**
     * (iterativ) Maximum
     * 
     * @return Node mit größtem Wert
     */
    Node imax() {
        Node tmp = root;

        while (tmp != null) {
            if (tmp.right == null) {
                return tmp;
            } else {
                tmp = tmp.right;
            }
        }

        return null;
    }

    /**
     * Minimum
     * 
     * @param r Root des (Teil-)Baumes
     * @return Node mit kleinstem Wert
     */
    private Node min(Node r) {
        if (r == null)
            return r;
        else if (r.left == null)
            return r;
        else
            return min(r.left);
    }

    /**
     * Minimum-Aufruf
     * 
     * @return Node mit kleinstem Wert
     */
    public Node min() {
        return min(root);
    }

    /**
     * Maximum
     * 
     * @param r Root des (Teil-)Baumes
     * @return Node mit größtem Wert
     */
    private Node max(Node r) {
        if (r == null)
            return r;
        else if (r.right == null)
            return r;
        else
            return max(r.right);
    }

    /**
     * Maximum-Aufruf
     * 
     * @return Node mit größtem Wert
     */
    public Node max() {
        return max(root);
    }

    /**
     * Rekursive find-Methode
     * 
     * @param key, gesuchter Wert
     * @param n,   root des Baumes/Teilbaumes
     * @return Node, der gesuchten key enthält
     */
    private Node find(int key, Node r) {
        if (r == null)
            return r;
        else if (r.key == key)
            return r;
        else if (key > r.key)
            return find(key, r.right);
        else
            return find(key, r.left);

    }

    /**
     * leichterer Aufruf der Rekursiven find Methode
     * 
     * @param key gesuchter Wert
     * @return Node, der gesuchten key enthält
     */
    public Node findRec(int key) {
        return find(key, root);
    }

    /**
     * Iterative find-Methode
     * 
     * @param key gesuchter Wert
     * @return Node, der gesuchten key enthält
     */
    Node find(int key) {
        Node tmp = root;

        while (tmp != null) {
            if (tmp.key == key) {
                return tmp;
            } else if (key > tmp.key) {
                tmp = tmp.right;
            } else {
                tmp = tmp.left;
            }
        }

        return null;
    }

    /**
     * iterative add Methode
     * 
     * @param n Node, der eingefügt wird
     * @return true, wenn erfolgreich eingefügt, false, wenn Wert schon enthalten
     */
    boolean add(Node n) {
        // Leerer Baum
        if (root == null) {
            root = n;
            return true;
        }

        // Hilszeiger
        Node tmp = root;

        while (true) {
            if (n.key < tmp.key) { // Wert kleiner?
                if (tmp.left == null) {
                    tmp.left = n;
                    return true;
                }
                tmp = tmp.left;
            } else if (n.key > tmp.key) { // Wert größer?
                if (tmp.right == null) {
                    tmp.right = n;
                    return true;
                }
                tmp = tmp.right;
            } else { // Wert ist schon drin
                return false;
            }
        }

    }

    /**
     * 
     * @param key, Wert des Knoten
     * @return true, wenn erfolgreich eingefügt, false, wenn Wert schon enthalten
     */
    boolean add(int key) {
        return add(new Node(key));
    }

    /**
     * 
     * @param n, Node, der hinzugefügt wird
     * @param r
     * @return
     */
    private boolean addRec(Node n, Node r) {
        // Leerer Baum
        if (root == null) {
            root = n;
            return true;
        } else if (n.key > r.key) {
            if (r.right == null) {
                r.right = n;
                return true;
            }
            return addRec(n, r.right);
        } else if (n.key < r.key) {
            if (r.left == null) {
                r.left = n;
                return true;
            }
            return addRec(n, r.left);
        } else {
            return false;
        }
    }

    /**
     * Aufruf der Rekursiven Methode mit int Wert
     * 
     * @param n
     * @return
     */
    public boolean addRec(int n) {
        return addRec(new Node(n), root);
    }

    // Pretty print the tree
    void print() {
        System.out.println("---------------------------------------");
        if (root == null)
            System.out.println("Empty!");
        else
            showTreeHelper(root, 0);
        System.out.println("---------------------------------------");
    }

    void showTreeHelper(Node n, int ebene) {
        if (n == null) {
            return;
        }
        showTreeHelper(n.right, ebene + 1);
        for (int i = 1; i <= ebene; i++) {
            System.out.print("....");
        }
        System.out.println(n.key);
        showTreeHelper(n.left, ebene + 1);
    }

}
