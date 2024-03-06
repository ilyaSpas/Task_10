package org.example;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(30);
        Triangle triangle = new Triangle(3, 3);
        Square square = new Square(3, 3);
        ConverterToFeet<AbstractShape> converterToFeet = new ConverterToFeet<>();

        converterToFeet.getInfoToFeet(circle);
        converterToFeet.getInfoToFeet(triangle);
        converterToFeet.getInfoToFeet(square);
    }
}
