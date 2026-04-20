package com.example;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Graph g = new Graph();

        // Vertices anlegen
        g.addVertex ( new Vertex("A"));
        g.addVertex ( new Vertex("B"));
        g.addVertex ( new Vertex("C"));
        g.addVertex ( new Vertex("D"));
        g.addVertex ( new Vertex("E"));
 
        // Edges anlegen
        g.addEdge (g.getVertex("A"), g.getVertex("B"), 6);
        g.addEdge (g.getVertex("A"), g.getVertex("D"), 1);
        g.addEdge (g.getVertex("B"), g.getVertex("D"), 2);
        g.addEdge (g.getVertex("B"), g.getVertex("E"), 2);
        g.addEdge (g.getVertex("B"), g.getVertex("C"), 5);
        g.addEdge (g.getVertex("C"), g.getVertex("E"), 5);
        g.addEdge (g.getVertex("E"), g.getVertex("D"), 1);
        
        // Graphen ausgeben
        g.print();
        
        // Graphen traversieren
        
        // 1. Hilfsmethode ArrayList<Vertex> getNeighbours ( Vertex v )
        System.out.println("\nNeighbours of A");
        for ( Vertex v : g.getNeighbours( g.getVertex ("A"))){
            System.out.print (v);
        }
        
        // 2. Depth-First (mit Stack)
        System.out.println ("\n\nDFS starting at " + g.getVertex ("A") + ": ");
        g.recTraversalDFS ( g.getVertex ("A") );
        
        
        
        // 3. Breath-First (mit Queue)
        // todo
        
        
       


    }
}