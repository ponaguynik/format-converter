package com.ponagayba.model.shape;

import java.util.HashMap;
import java.util.Map;

public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> result = new HashMap<>();
        result.put("name", name);
        result.put("side1", side1);
        result.put("side2", side2);
        result.put("side3", side3);
        return result;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}
