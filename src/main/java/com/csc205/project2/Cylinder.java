package com.csc205.project2;

public class Cylinder extends Shape{

    private double height;
    private double radius;

    public Cylinder(){
        super();
        this.radius = 0.00;
        this.height = 0.00;
    }

    public Cylinder(double h, double r){
        super();
        this.radius = r;
        this.height = h;
    }

    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double h){
        this.height = h;
    }

    public void setRadius(double r){
        this.radius = r;
    }

    public double surfaceArea(){
        return (2 * (Math.PI * radius * height)) + (2 * (Math.PI * Math.pow(radius, 2)));
    }

    public double volume(){
        return (Math.PI * Math.pow(radius, 2) * height);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
