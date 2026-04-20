package com.example;

public class Main {
    public static void main(String[] args) {
        Node n10 = new Node(10);
        Node n8 = new Node(8);
        Node n15 = new Node(15);
        Node n5 = new Node(5);
        Node n9 = new Node(9);
        Node n13 = new Node(13);
        Node n17 = new Node(17);

        n10.left = n8;
        n10.right = n15;
        n8.left = n5;
        n8.right = n9;
        n15.left = n13;
        n15.right = n17;

        Tree tree = new Tree(n10);
        
        if(tree.add(19)) System.out.println("Wert wurde hinzugefügt");
        else System.out.println("Wert schon vorhanden.");

        if(tree.addRec(4)) System.out.println("Wert wurde hinzugefügt");
        else System.out.println("Wert schon vorhanden.");
        
        Node search = tree.findRec(4);
        if (search == null) {
            System.out.println("Wert nicht gefunden");
        } else {
            System.out.println("Gefundener Wert: " + search.key);
        }

        tree.print();
        
        System.out.println("Höhe: "+tree.height());
        System.out.println("Minimum: "+ tree.min().key +" | "+ tree.imin().key);
        System.out.println("Maximum: "+ tree.max().key +" | "+ tree.imax().key);
        System.out.println("Parent: "+ tree.getParent(8).key);

        if(tree.delete(17))
        System.out.println("Löschvorgang abgeschlossen!");
        else
        System.out.println("!!Löschvorgang fehlerhaft!!");

        tree.print();

        System.out.println("\nPre Order: ");
        tree.traversePreOrder();

        System.out.println("\nIn Order: ");
        tree.traverseInOrder();

        System.out.println("\nPost Order: ");
        tree.traversePostOrder();
    }
}