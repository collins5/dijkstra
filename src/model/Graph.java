package model;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private final List<Vertex> vertices;
    private final List<Edge> edges;


    public Graph(List<Vertex> vertices, List<Edge> edges){
        this.edges = edges;
        this.vertices = vertices;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }
}
