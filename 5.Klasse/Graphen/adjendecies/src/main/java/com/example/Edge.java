package com.example;
public class Edge {

    //Instanzen
    private Vertex destination;
    private int weight;

    // Konstruktor
    public Edge(Vertex destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }

    //Getter
    public Vertex getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    //Setter
    public void setDestination(Vertex destination) {
        this.destination = destination;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void print(){
        System.out.print("["+ destination.getName() + ", "+ weight+ "]");
    }
    
}
