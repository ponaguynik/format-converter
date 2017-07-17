package com.ponagayba.model.shape;

import com.ponagayba.util.DoubleNode;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    Triangle() {
    }

    @Override
    public List<DoubleNode<String, Object>> getParams() {
        List<DoubleNode<String, Object>> result = new ArrayList<>();
        result.add(new DoubleNode<>("name", name));
        result.add(new DoubleNode<>("side1", side1));
        result.add(new DoubleNode<>("side2", side2));
        result.add(new DoubleNode<>("side3", side3));
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
