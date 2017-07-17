package com.ponagayba.format.builder;

import com.ponagayba.format.JSON;

public class JSONBuilder implements FormatBuilder {

    private StringBuilder result = new StringBuilder();

    private int level = 0;

    @Override
    public JSONBuilder addHeader() {
        return this;
    }

    @Override
    public JSONBuilder startArray(String name) {
        result.append(tab()).append(String.format("\"%s\": [\n", name));
        level++;
        return this;
    }

    @Override
    public JSONBuilder endArray(String name, boolean next) {
        if (level > 0)
            --level;
        if (next)
            result.append(tab()).append("],\n");
        else
            result.append(tab()).append("]\n");
        return this;
    }

    @Override
    public JSONBuilder startObject(String name) {
        if (name == null || name.equals(""))
            result.append(tab()).append("{\n");
        else
            result.append(tab()).append(String.format("\"%s\": {\n", name));
        level++;
        return this;
    }

    @Override
    public JSONBuilder endObject(String name, boolean next) {
        if (level > 0)
            --level;
        if (next)
            result.append(tab()).append("},\n");
        else
            result.append(tab()).append("}\n");
        return this;
    }

    @Override
    public JSONBuilder addParam(String name, Object value, boolean next) {
        if (value == null || value instanceof Integer || value instanceof Double || value instanceof Boolean)
            result.append(tab()).append(String.format("\"%s\": %s", name, value));
        else
            result.append(tab()).append(String.format("\"%s\": \"%s\"", name, value));
        if (next)
            result.append(",\n");
        else
            result.append("\n");
        return this;
    }

    private String tab() {
        StringBuilder tabs = new StringBuilder();
        for (int i = 0; i < level; i++)
            tabs.append("\t");
        return tabs.toString();
    }

    @Override
    public JSON getResult() {
        return new JSON(result.toString());
    }
}
