package com.example;
import java.util.*;


public class Vertex {
    String name;
    ArrayList<Edge> edges;

    public Vertex(String name){
        this.name=name;
        edges = new ArrayList<>();
    }

    public void addEdge(Vertex dest, int weight){

        edges.add(new Edge(this, dest, weight));
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
