package com.ponagayba.format.builder;

public class FormatBuilderFactory {

    private static FormatBuilderFactory factory = new FormatBuilderFactory();

    public static FormatBuilderFactory getInstance() {
        return factory;
    }

    private FormatBuilderFactory() {
    }

    public XMLBuilder getXMLBuilder() {
        return new XMLBuilder();
    }

    public JSONBuilder getJSONBuilder() {
        return new JSONBuilder();
    }
}
