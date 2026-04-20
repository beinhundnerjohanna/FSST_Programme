package com.example;

import java.util.ArrayList;
import java.util.Stack;

public class Graph {

    public ArrayList<Vertex> vertices;
    public ArrayList<Edge> edges;

    public Graph() {
        vertices = new ArrayList();
        edges = new ArrayList();
    }

    /**
     * Rekursives Depth First Traversal
     * 
     * @param current   Aktueller Vertex
     * @param visited   Liste der bereits besuchten Knoten
     */
    private void recTraversalDFS(Vertex current, ArrayList<Vertex> visited) {

        // Vertex besuchen
        System.out.println(current);

        // Merken, welche Vertices schon besucht worden sind
        visited.add(current);
        
        // Nachbarn durchlaufen
        for (Vertex neighbour : getNeighbours(current)) {
            if (!visited.contains(neighbour)) {
                recTraversalDFS(neighbour, visited);
            }
        }
    }

    /**
     * Helper-Methode zum rekursiven Aufruf
     * @param start 
     */
    public void recTraversalDFS(Vertex start) {

        // Sonderfälle behandeln
        if (start == null || !vertices.contains(start)) {
            return;
        }

        // Starten des Traversieren
        ArrayList<Vertex> visited = new ArrayList<>();
        recTraversalDFS(start, visited);
    }

    /**
     * Führt eine Tiefesuche (Depth First Traversal) ab dem Startvertex aus und
     * gibt die besuchten Knoten in der Konsole aus.
     *
     * @param start Startvertex
     */
    public void traversalDFS(Vertex start) {

        // Sonderfälle: Nicht enthalten, oder null
        if (start == null || !vertices.contains(start)) {
            return;
        }

        // Merken, welche Vertices schon besucht worden sind
        ArrayList<Vertex> visited = new ArrayList<>();

        // Stack zum Abarbeiten
        Stack<Vertex> stack = new Stack<>();

        // Mit Start beginnen
        stack.push(start);

        // Fertig?
        while (!stack.isEmpty()) {

            Vertex current = stack.pop();

            if (!visited.contains(current)) {

                // Vertex besuchen
                System.out.println(current);

                // Als besucht markieren
                visited.add(current);

                // Nachbarn ermitteln
                ArrayList<Vertex> neighbours = getNeighbours(current);

                // Erste Nachbarn auswählen und auf den Stack legen,
                // wenn er noch nicht besucht wurde
                for (Vertex n : neighbours) {

                    // schon besucht?
                    if (!visited.contains(n)) {

                        // auf den Stack, nur wenn noch nicht drauf
                        if (!stack.contains(n)) {
                            stack.push(n);
                        }
                    }
                }

            }
        }
    }

    /**
     * Liefert die Nachbarn eines Vertex v
     *
     * @param v Vertex, von dem die Nachbarn ermittelt werden solln
     * @return Liste der Nachbarn von v, Leere Liste wenn keine Nachbarn oder
     * nicht in der Liste
     */
    ArrayList<Vertex> getNeighbours(Vertex v) {

        ArrayList<Vertex> neighbours = new ArrayList();

        for (Edge e : edges) {

            if (e.a.equals(v)) {
                // Ausgangspunkt a? -> b als Nachbar hinzufügen
                neighbours.add(0, e.b);

            } else if (e.b.equals(v)) {

                // Ausgangspunkt b? -> a als Nachbar hinzufügen
                neighbours.add(0, e.a);
            }
        }

        return neighbours;
    }

    /**
     * Liefert den Vertex oder null wenn nicht enthalten
     *
     * @param s Name des gesuchten Vertex
     * @return Vertex, der gesucht wurde
     */
    public Vertex getVertex(String s) {
        for (Vertex v : vertices) {
            if (s.equals(v.name)) {
                return v;
            }
        }
        return null;
    }

    public void addEdge(Edge e) {
        edges.add(e);
    }

    public void addEdge(Vertex a, Vertex b, int weight) {
        addEdge(new Edge(a, b, weight));
    }

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public void addVertex(String name) {
        addVertex(new Vertex(name));
    }

    public void print() {

        // Alle Vertices ausgeben
        for (Vertex v : vertices) {
            System.out.print("Vertex " + v.name + " ");

            // Alles Egdes für den akuellen Vertex ausgeben
            for (Edge e : edges) {

                if (e.a.name.equals(v.name)) {
                    System.out.print("->" + e.b.name + "(" + e.weight + ")");
                } else if (e.b.name.equals(v.name)) {
                    System.out.print("->" + e.a.name + "(" + e.weight + ")");
                }
            }
            System.out.println();
        }
    }
}
