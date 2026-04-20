package com.example;

import java.util.ArrayList;

public class Graph {

    public ArrayList<Vertex> vertices;

    //Konstruktor
    public Graph() {
        vertices = new ArrayList<>();
    }

    /* Diverse andere Methoden */
    // Vertex mit Namen suchen
    public Vertex getVertex(String name){
        for(Vertex v : vertices){
            if(v.getName() == name){
                return v;
            }
        }
        return null;
    }
    // Vertex hinzufügen
    public boolean addVertex(Vertex v){
        if(vertices.contains(v))
            return false;
        
        vertices.add(v);
        return true;
    }

    //Vertex löschen
    public boolean removeVertex(Vertex v){
        return false;
    }

    // Edge hinzufügen
    public boolean addEdge(Vertex start, Vertex dest, int weight){
        if(vertices.contains(start)&&vertices.contains(dest)){
            start.addEdge(dest, weight);
            dest.addEdge(start, weight);
            return true;
        }
        return false; 
    }

    // Edge löschen
    public boolean removeEdge(Vertex start, Vertex dest, int weight){
        if(vertices.contains(start)&&vertices.contains(dest)){
            start.removeEdge(dest, weight);
            dest.removeEdge(start, weight);
            return true;
        }
       
        return false;
    }

    // Graphen ausgeben
    public void print(){
        for(Vertex v : vertices){
            v.print();
        }
    }
}