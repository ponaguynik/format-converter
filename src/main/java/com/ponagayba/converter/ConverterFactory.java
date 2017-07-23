package com.ponagayba.converter;

public class ConverterFactory {
    private static ConverterFactory factory = new ConverterFactory();

    public static ConverterFactory getInstance() {
        return factory;
    }

    private ConverterFactory() {
    }

    public XMLConverter getXMLConverter() {
        return new XMLConverter();
    }

    public JSONConverter getJSONConverter() {
        return new JSONConverter();
    }
}
