package com.ponagayba.model.shape;

public class ShapeFactory {

    private static ShapeFactory factory = new ShapeFactory();

    public static ShapeFactory getInstance() {
        return factory;
    }

    private ShapeFactory() {
    }

    public Circle getCircle() {
        return new Circle();
    }

    public Triangle getTriangle() {
        return new Triangle();
    }

    public Square getSquare() {
        return new Square();
    }
}
