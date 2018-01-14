package model;

public class Edge {

    private final String ID;
    private final Vertex source;
    private final Vertex destination;
    private final int weight;


    public Edge(String ID, Vertex source, Vertex destination, int weight){

        this.ID = ID;
        this.source = source;
        this.weight = weight;
        this.destination = destination;

    }


    public String getID() {
        return ID;
    }


    public Vertex getSource() {
        return source;
    }


    public Vertex getDestination() {
        return destination;
    }


    public int getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return source + " " + destination;
    }

}
