package com.ponagayba.model.group;

import com.ponagayba.converter.Container;
import com.ponagayba.model.shape.Shape;
import com.ponagayba.util.DoubleNode;

import java.util.ArrayList;
import java.util.List;

public class Group extends Shape implements Container {

    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public Shape getShape(int id) {
        return shapes.get(id);
    }

    public void removeShape(int id) {
        shapes.remove(id);
    }

    @Override
    public List<DoubleNode<String, Object>> getParams() {
        List<DoubleNode<String, Object>> result = new ArrayList<>();
        for (Shape shape : shapes) {
            if (shape instanceof Group)
                result.add(new DoubleNode<>("group", shape));
            else
                result.add(new DoubleNode<>("shape", shape));
        }
        return result;
    }

    @Override
    public String rootName() {
        return "group";
    }
}
