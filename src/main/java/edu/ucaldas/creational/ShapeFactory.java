package edu.ucaldas.creational;

public class ShapeFactory {
    public Shape createShape(String type) {
        if (type == null) return null;

        switch (type.toLowerCase()) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
