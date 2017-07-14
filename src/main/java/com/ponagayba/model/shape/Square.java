package com.ponagayba.model.shape;

import java.util.HashMap;
import java.util.Map;

public class Square extends Shape {

    private double side;

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> result = new HashMap<>();
        result.put("name", name);
        result.put("side", side);
        return result;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
