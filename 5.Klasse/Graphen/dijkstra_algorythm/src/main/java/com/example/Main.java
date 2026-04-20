package com.example;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph();

        // 1. Vertices anlegen und dem Graphen hinzufügen
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");

        g.addVertex(a);
        g.addVertex(b);
        g.addVertex(c);
        g.addVertex(d);
        g.addVertex(e);

        // 2. Edges anlegen
        g.addEdge(a, b, 6);
        g.addEdge(a, d, 1);
        g.addEdge(b, d, 2);
        g.addEdge(b, e, 2);
        g.addEdge(b, c, 5);
        g.addEdge(c, e, 5);
        g.addEdge(e, d, 1);

        // 3. Tabelle mit Startpunkt A initialisieren
        DijkstraTable t = new DijkstraTable(a, g);

        // 4. Berechnen und ausgeben
        t.calculate(g);
        t.printShortestPath(c);
    }
}