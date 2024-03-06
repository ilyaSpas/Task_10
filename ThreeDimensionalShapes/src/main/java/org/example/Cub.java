package org.example;

public class Cub extends AbstractShape {

    private final double width;
    private final double height;
    private final double depth;

    public Cub(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    @Override
    public double getArea() {
        return width * height * depth;
    }

    @Override
    public double getPerimeter() {
        return 4 * (width + height + depth);
    }

    @Override
    public void getInfo() {
        System.out.println("Cub area is " + this.getArea());
        System.out.println("Cub perimeter is " + this.getPerimeter());
    }

    @Override
    public String toString() {
        return "Cub: " +
               "width - " + width +
               ", height - " + height +
               ", depth - " + depth;
    }
}
