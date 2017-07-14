package com.ponagayba.model.group;

import com.ponagayba.converter.Container;
import com.ponagayba.model.shape.Shape;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Map<String, Object> getParams() {
        Map<String, Object> result = new HashMap<>();
        for (Shape shape : shapes) {
            if (shape instanceof Group)
                result.put("group", shape);
            else
                result.put("shape", shape);
        }
        return result;
    }
}
