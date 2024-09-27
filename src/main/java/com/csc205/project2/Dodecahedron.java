package com.csc205.project2;

public class Dodecahedron extends Shape{
    private double edgeLength;

    public Dodecahedron(){
        super();
        this.edgeLength = 0.00;
    }

    public Dodecahedron(double e){
        super();
        this.edgeLength = e;
    }

    public double getEdgeLength(){
        return edgeLength;
    }

    public void setEdgeLength(double e){
        this.edgeLength = e;
    }

    public double surfaceArea(){
        return 3 * Math.sqrt(25 + (10 * Math.sqrt(5))) * Math.pow(edgeLength, 2);
    }

    public double volume(){
        return ((15 + 7 * Math.sqrt(5))/4.00) * Math.pow(edgeLength, 3);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Dodecahedron {");
        sb.append("edgeLength=").append(edgeLength);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
