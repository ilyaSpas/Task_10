package org.example;

public class Triangle extends AbstractShape {

    private final double width;

    private final double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (width * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return width + (2 * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2)));
    }

    @Override
    public void getInfo() {
        System.out.println("Triangle area is " + this.getArea());
        System.out.println("Triangle perimeter is " + this.getPerimeter());
    }
}
