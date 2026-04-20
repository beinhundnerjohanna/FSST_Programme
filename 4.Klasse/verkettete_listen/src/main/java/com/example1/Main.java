package com.example1;

public class Main {
    public static void main(String[] args) {

        // neue Liste erstellen
        List l = new List();

        // neuen Knoten erstellen
        Node n = new Node('X');
        Node m = new Node('Y');

        // Liste auf das erste Element zeigen lassen:
        l.start = n;

        // m auf das bisherige erste Element in der Liste zeigen lassen:
        m.next = l.start;

        // Liste auf neues erstes Element zeigen lassen:
        l.start = m;

        //selbiges mit Methode:
        l.prepend(new Node('Z'));

        l.append(new Node('V'));
        l.prepend("Hallo");
       
       
        System.out.println("entfernt: "+l.removeFirst());
        l.insert(5, new Node('J'));
        l.set(1, 'E');
        l.set(2, new Node('E'));
        l.removeLast();
        l.remove('Y');

        //Liste ausgeben:
        l.print();

        //Ausgabe wieviele Buchstaben in der Liste
        System.out.println(l.count());

        System.out.println("letze Stelle: "+l.get(l.count()-1));
        System.out.println("Gesuchter Buchstabe: " + l.findLast('E'));
    }
}