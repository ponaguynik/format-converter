package com.ponagayba.format;

public abstract class Format {

    private final String data;

    public Format(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return getData();
    }
}
