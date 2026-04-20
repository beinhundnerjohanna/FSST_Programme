package com.example;

public class DijkstraTableEntry {
    Vertex destination;
    double distance;
    Vertex previousVertex;

    // previousVertex muss nicht im Konstruktor initialisiert werden!! --> ändert
    // sich immer, etc.
    // PIXELPILOT --> Aufgaben

    public DijkstraTableEntry(Vertex destination, double distance) {
        this.destination = destination;
        this.distance = distance;
    }
 
    public int getShortestDistance(){
        return 0;
    }

    @Override
    public String toString() {
        return "Destination: " + destination.name +
                ", Distance: " + distance +
                ", PreviousVertex: " + (previousVertex != null ? previousVertex.name : "null");
    }

}
