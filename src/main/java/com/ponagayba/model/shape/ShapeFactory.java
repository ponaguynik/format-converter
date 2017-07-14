package com.ponagayba.model.shape;

public class ShapeFactory {

    private static ShapeFactory factory = new ShapeFactory();

    public static ShapeFactory getInstance() {
        return factory;
    }

    private ShapeFactory() {
    }

    public Shape getCircle() {
        return new Circle();
    }

    public Shape getTriangle() {
        return new Triangle();
    }

    public Shape getSquare() {
        return new Square();
    }
}
