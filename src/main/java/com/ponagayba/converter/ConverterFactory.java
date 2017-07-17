package com.ponagayba.converter;

public class ConverterFactory {
    private static ConverterFactory factory = new ConverterFactory();

    public static ConverterFactory getInstance() {
        return factory;
    }

    private ConverterFactory() {
    }

    public Converter getXMLConverter() {
        return new XMLConverter();
    }

    public Converter getJSONConverter() {
        return new JSONConverter();
    }
}
