package org.example;

public class ConverterToFeet<T extends AbstractShape> {
    public void getInfoToFeet(T shape) {
        System.out.println("Square area is " + (shape.getArea() / 3.28084) + " ft.");
        System.out.println("Square perimeter is " + (shape.getPerimeter() / 3.28084) + " ft.");
    }
}
