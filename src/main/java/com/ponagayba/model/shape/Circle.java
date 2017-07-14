package com.ponagayba.model.shape;

import java.util.HashMap;
import java.util.Map;

public class Circle extends Shape {

    private double radius;

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> result = new HashMap<>();
        result.put("name", name);
        result.put("radius", radius);
        return result;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
