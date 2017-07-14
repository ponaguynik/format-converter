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
    public FormatBuilder startHolder(String name) {
        result.append(tab()).append(String.format("{\"%s\": [\n", name));
        level++;
        return this;
    }

    @Override
    public FormatBuilder endHolder(String name, boolean next) {
        if (level > 0)
            --level;
        if (next)
            result.append(tab()).append("]},\n");
        else
            result.append(tab()).append("]}\n");
        return this;
    }

    @Override
    public FormatBuilder startElement(String name) {
        result.append(tab()).append(String.format("\"%s\": {\n", name));
        level++;
        return this;
    }

    @Override
    public FormatBuilder endElement(String name, boolean next) {
        if (level > 0)
            --level;
        if (next)
            result.append(tab()).append("},\n");
        else
            result.append(tab()).append("}\n");
        return this;
    }


    @Override
    public JSONBuilder addParam(String name, String value, boolean next) {
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
