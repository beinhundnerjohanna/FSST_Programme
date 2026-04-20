package com.example1;

public class List {

    Node start;

    /**
     * Neuer Knoten wird an den Anfang eingefügt
     * 
     * @param n Knoten, der am Anfang eingefügt werden soll
     */
    public void prepend(Node n) {
        n.next = start; // n auf das bisherige erste Element in der Liste zeigen lassen
        start = n; // Liste auf neues erstes Element zeigen lassen
    }

    /**
     * Fügt einen String als einzelne Buchstaben an den Anfang ein
     * 
     * @param s String, der eingefügt wird
     */
    public void prepend(String s) {
        for (int i = s.length(); i > 0; i--) {
            prepend(new Node(s.charAt(i - 1)));
        }
    }

    /**
     * Zählt wieviele Elemente in der Liste sind
     * 
     * @return Anzahl der Elemente
     */
    public int count() {

        Node tmp = start;
        int counter = 0;

        while (tmp != null) {
            tmp = tmp.next;
            counter++;
        }
        return counter;
    }

    /**
     * Fügt einen Knoten am Ende der Liste hinzu
     * 
     * @param n Knoten, der am Ende hinzugefügt wird
     */
    public void append(Node n) {
        Node tmp = start; // Am Anfang beginnen

        // Ist das nächste Element null, ist das Ende der Liste erreicht
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        // Das letzte Element auf das neue letzte Element setzen
        tmp.next = n;
    }

    /**
     * Gibt alle Nodes in der Liste aus
     */
    public void print() {

        Node tmp = start;

        while (tmp != null) { // solange bis null erreicht
            // Node ausgeben
            System.out.println(tmp);

            // auf nächsten Knoten zeigen lassen:
            tmp = tmp.next;
        }

    }

    /**
     * Gibt Node zurück, der an der n-ten Stelle ist
     * 
     * @param n Stelle, die zurückgegeben werden soll
     * @return Node, an der Stelle n
     */
    public Node get(int n) {
        Node tmp = start;

        for (int i = 0; i <= n; i++) {
            if (i == n) {
                return tmp;
            } else {
                tmp = tmp.next;
            }
        }
        return null;
    }

    /**
     * Entfernt den ersten Knoten
     * 
     * @return den entfernten Knoten
     */
    public Node removeFirst() {
        Node tmp = start;
        if (tmp.next == null)
            return null;
        else {
            start = tmp.next;
            return tmp;
        }

    }

    /**
     * Fügt einen Knoten nach dem n-ten Knoten ein
     * 
     * @param n,  Stelle vom Knoten, nachdem eingefügt wird
     * @param nd, Knoten, der eingefügt wird
     */
    public void insert(int n, Node nd) {
        if (n >= count())
            System.out.println("nicht möglich");
        else {
            Node tmp = get(n);
            nd.next = get(n + 1);
            tmp.next = nd;
        }
    }

    /**
     * setzt data eines Knoten auf neuen Wert
     * 
     * @param k, Stelle des Knotens
     * @param c, neuer Wert
     */
    public void set(int k, char c) {
        get(k).data = c;
    }

    /**
     * ersetzt einen Knoten
     * 
     * @param k, Stelle des Knoten, der ersetzt wird
     * @param n, Knoten, mit dem ersetzt wird
     */
    public void set(int k, Node n) {
        n.next = get(k).next;
        get(k - 1).next = n;
    }

    /**
     * sucht den ersten Knoten der an data 'c' enthält
     * 
     * @param c, zu suchender Wert
     * @return erster Knoten der c enthält
     */

    public Node findFirst(char c) {
        Node tmp = start;
        for (int i = 0; i < count(); i++) {
            if (tmp.data == c) {
                return tmp;
            }
            tmp = tmp.next;
        }
        return null;
    }

    /**
     * sucht den letzten Knoten der an data 'c' enthält
     * 
     * @param c, zu suchender Wert
     * @return letzter Knoten der c enthält
     */
    public Node findLast(char c) {
        Node tmp = start;
        Node found = null;
        for (int i = 0; i < count(); i++) {
            if (tmp.data == c) {
                found = tmp;
            }
            tmp = tmp.next;
        }
        return found;
    }

    /**
     * entfernt letzten Knoten
     */
    public void removeLast() {
        get(count() - 2).next = null;
    }

    /**
     * entfernt Knoten mit data c
     * @param c data, des Knotens der entfernt werden soll
     * @return true wenn entfernt
     */
    public boolean remove(char c) {
        Node tmp = start;
        while (tmp.next.data != c) {
            tmp = tmp.next;
            if (tmp.next == null)
                return false;
        }
        tmp.next = tmp.next.next;
        return true;
    }
}
