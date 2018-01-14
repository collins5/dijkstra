package model;

public class Vertex {

    private String ID;
    private String name;

    public Vertex(String ID, String name){
        this.ID = ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    @Override
    public int  hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ID == null) ? 0 : getID().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vertex other = (Vertex) obj;
        if (ID == null){
            if (other.ID != null)
                return false;
        }else if (!ID.equals(other.ID))
            return false;
        return true;
    }

    @Override
    public String toString(){
        return name;
    }

}
