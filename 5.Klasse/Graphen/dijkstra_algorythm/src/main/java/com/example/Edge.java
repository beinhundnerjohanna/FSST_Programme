package com.example;

public class Edge {
    Vertex start;
    Vertex end;
    int weight;

    public Edge(Vertex start, Vertex end, int weight){
        this.start=start;
        this.end=end;
        this.weight=weight;
    }

    public void print(){
        System.out.print("["+ end.name + ", "+ weight+ "]");
    }

}
