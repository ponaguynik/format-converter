package com.ponagayba.model.shape;

import com.ponagayba.util.DoubleNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Circle extends Shape {

    private double radius;

    Circle() {
    }

    @Override
    public List<DoubleNode<String, Object>> getParams() {
        List<DoubleNode<String, Object>> result = new ArrayList<>();
        result.add(new DoubleNode<>("name", name));
        result.add(new DoubleNode<>("radius", radius));
        return result;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
