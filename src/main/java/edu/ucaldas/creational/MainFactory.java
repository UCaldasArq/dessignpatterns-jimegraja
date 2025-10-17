package edu.ucaldas.creational;

public class MainFactory {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.createShape("Circle");
        Shape square = factory.createShape("Square");
        Shape unknown = factory.createShape("Triangle");

        System.out.println(circle != null ? circle.draw() : "Forma no reconocida.");
        System.out.println(square != null ? square.draw() : "Forma no reconocida.");
        System.out.println(unknown != null ? unknown.draw() : "Forma no reconocida.");
    }
}
