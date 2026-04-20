package com.example;

import java.util.*;

public class DijkstraTable {

    ArrayList<DijkstraTableEntry> entries;
    Vertex v;

    public DijkstraTable(Vertex v, Graph g) {
        this.v = v;
        entries = new ArrayList<>();

        for (Vertex entry : g.vertices) {
            if (entry == v) { 
                entries.add(new DijkstraTableEntry(entry, 0));
            } else {
                entries.add(new DijkstraTableEntry(entry, Integer.MAX_VALUE));
            }
        }
    }

    public void print() {
        for (DijkstraTableEntry e : entries) {
            System.out.println(e);
        }

    }

    public DijkstraTableEntry getEntryFromVertex(Vertex v) {
        for (DijkstraTableEntry entry : entries) {
            if (entry.destination == v) {
                return entry;
            }
        }
        return null;
    }

   public DijkstraTableEntry getNearestEntry(ArrayList<Vertex> unvisited) {
        DijkstraTableEntry dte = getEntryFromVertex(unvisited.get(0));

        for (Vertex v : unvisited) {
            DijkstraTableEntry compare = getEntryFromVertex(v);
            if (compare.getShortestDistance() < dte.getShortestDistance()) {
                dte = compare;
            }
        }
        return dte;
    }


    public void calculate(Graph g) {
        ArrayList<Vertex> unvisited = new ArrayList<>(g.vertices);

        while (!unvisited.isEmpty()) {

            DijkstraTableEntry currentEntry = new DijkstraTableEntry(v, 0);//getNearestEntry(unvisited);

            if (currentEntry == null || currentEntry.distance == Integer.MAX_VALUE) break;

            Vertex currentVertex = currentEntry.destination;
            unvisited.remove(currentVertex);

            for (Edge edge : currentVertex.edges) {
                Vertex neighbor = edge.end;
                
                if (unvisited.contains(neighbor)) {
                    DijkstraTableEntry neighborEntry = getEntryFromVertex(neighbor);
                    double newDistance = currentEntry.distance + edge.weight;

                    if (newDistance < neighborEntry.distance) {
                        neighborEntry.distance = newDistance;
                        neighborEntry.previousVertex = currentVertex;
                    }
                }
            }
        }
    }

    public void printShortestPath(Vertex to) {
        DijkstraTableEntry target = getEntryFromVertex(to);
        if (target == null || target.distance == Integer.MAX_VALUE) {
            System.out.println("Kein Pfad zu " + to.name + " gefunden.");
            return;
        }

        System.out.println("----------------------------------------");
        System.out.println("Kürzester Pfad zu " + to.name + ": " + (int)target.distance + " km");
        System.out.println("----------------------------------------");

        List<String> pathSteps = new ArrayList<>();
        Vertex curr = to;
        while (curr != null) {
            DijkstraTableEntry entry = getEntryFromVertex(curr);
            pathSteps.add(curr.name + " ------- " + (int)entry.distance + " km");
            curr = entry.previousVertex;
        }
        Collections.reverse(pathSteps);
        for (int i = 0; i < pathSteps.size(); i++) {
            System.out.println(pathSteps.get(i));
            if (i < pathSteps.size() - 1) {
                System.out.println("|");
            }
        }
    }

}
