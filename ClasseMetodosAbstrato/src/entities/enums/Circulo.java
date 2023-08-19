package entities.enums;

import entities.Shape;

public class Circulo extends Shape {

    private Double radius;

    public Circulo() {
        super();
    }

    public Circulo(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
