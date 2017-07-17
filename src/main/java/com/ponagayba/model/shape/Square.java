package com.ponagayba.model.shape;

import com.ponagayba.util.DoubleNode;

import java.util.ArrayList;
import java.util.List;

public class Square extends Shape {

    private double side;

    Square() {
    }

    @Override
    public List<DoubleNode<String, Object>> getParams() {
        List<DoubleNode<String, Object>> result = new ArrayList<>();
        result.add(new DoubleNode<>("name", name));
        result.add(new DoubleNode<>("side", side));
        return result;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
