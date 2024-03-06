package org.example;

public class Circle extends AbstractShape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: radius - " + radius;
    }

    @Override
    public void getInfo() {
        System.out.println("Circle area is " + this.getArea());
        System.out.println("Circle perimeter is " + this.getPerimeter());
    }
}
