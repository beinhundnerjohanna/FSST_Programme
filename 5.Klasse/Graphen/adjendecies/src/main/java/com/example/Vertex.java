package com.example;

import java.util.ArrayList;

public class Vertex {

    //Instanzvariablen
    private String name;
    private ArrayList<Edge> edges;

    //Konstruktor
    public Vertex(String name) {
        this.name = name;
        edges = new ArrayList<>();
    }

    /* Diverse andere Methoden */

    // Edge hinzufügen
    public boolean addEdge(Vertex dest, int weight){
        edges.add(new Edge(dest, weight));
        
        return true;
    }

    // Edge löschen
    public boolean removeEdge(Vertex dest, int weight){
        for(Edge e : edges){
            if(e.getDestination() == dest){
                edges.remove(e);
                return true;
            }
        }
        return false;
    }
    
    // herausfinden, ob mir einem bestimmten anderen verbunden
    
    // alle Edges ausgeben

    //Getter
    public String getName() {
        return name;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.print("( "+name+" )");
        
        for(Edge e : edges){
            System.out.print("->");
            e.print();
        }
        System.out.println("-|");
    }
   
}
