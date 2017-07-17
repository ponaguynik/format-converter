package com.ponagayba.format.builder;

import com.ponagayba.format.XML;

public class XMLBuilder implements FormatBuilder {

    private StringBuilder result = new StringBuilder();

    private static final String HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

    private int level = 0;

    @Override
    public XMLBuilder addHeader() {
        result.append(HEADER).append("\n");
        return this;
    }

    @Override
    public XMLBuilder startArray(String name) {
        result.append(tab()).append(String.format("<%s>\n", name));
        level++;
        return this;
    }

    @Override
    public XMLBuilder endArray(String name, boolean next) {
        if (level > 0)
            --level;
        result.append(tab()).append(String.format("</%s>\n", name));
        return this;
    }

    @Override
    public XMLBuilder startObject(String name) {
        return startArray(name);
    }

    @Override
    public XMLBuilder endObject(String name, boolean next) {
        return endArray(name, next);
    }

    @Override
    public XMLBuilder addParam(String name, Object value, boolean next) {
        result.append(tab()).append(String.format("<%s>%s</%s>\n", name, value, name));
        return this;
    }

    private String tab() {
        StringBuilder tabs = new StringBuilder();
        for (int i = 0; i < level; i++)
            tabs.append("\t");
        return tabs.toString();
    }

    @Override
    public XML getResult() {
        return new XML(result.toString());
    }
}
