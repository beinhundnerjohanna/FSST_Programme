package com.example;
import java.util.*;
public class Graph {
    
    ArrayList<Vertex> vertices;

    public Graph(){
        vertices = new ArrayList<>();
    }

    public void addVertex(Vertex v){
        vertices.add(v);
    }

    public Vertex getVertex(String s){

        for(Vertex v : vertices){
            if(s.equals(v.name)){
                return v;
            }
        }
        return null;
    }


    public void addEdge(Vertex start, Vertex end, int weight){
        if(vertices.contains(start) && vertices.contains(end)){
            start.addEdge(end,weight);
            end.addEdge(start,weight);
        }
    }

      // Graphen ausgeben
    public void print(){
        for(Vertex v : vertices){
            v.print();
        }
    }
}
