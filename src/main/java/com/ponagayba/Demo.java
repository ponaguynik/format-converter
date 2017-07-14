package com.ponagayba;


import com.ponagayba.converter.Converter;
import com.ponagayba.converter.ConverterFactory;

public class Demo {

    public static void main(String[] args) {
        Converter xmlConverter = ConverterFactory.getInstance().getXMLConverter();
        xmlConverter.convert(null);
        Converter jsonConverter = ConverterFactory.getInstance().getJSONConverter();
        jsonConverter.convert(null);
    }
}
