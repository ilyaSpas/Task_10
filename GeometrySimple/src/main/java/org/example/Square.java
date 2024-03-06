package org.example;

public class Square extends AbstractShape {

    private final double sideA;

    private final double sideB;

    public Square(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public String toString() {
        return "Square: side A - " + sideA +
               ", side B - " + sideB;
    }

    @Override
    public void getInfo() {
        System.out.println("Square area is " + this.getArea());
        System.out.println("Square perimeter is " + this.getPerimeter());
    }
}
