package com.ponagayba.model.shape;

import com.ponagayba.converter.Convertible;


public abstract class Shape implements Convertible {

    protected String name = this.getClass().getSimpleName().toLowerCase();

    @Override
    public String rootName() {
        return "shape";
    }
}
