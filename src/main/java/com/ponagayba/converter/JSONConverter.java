package com.ponagayba.converter;

import com.ponagayba.format.JSON;
import com.ponagayba.format.builder.FormatBuilderFactory;
import com.ponagayba.format.builder.JSONBuilder;


public class JSONConverter implements Converter {

    public JSON convert(Convertible object) {
        JSONBuilder builder = FormatBuilderFactory.getInstance().getJSONBuilder();
        builder.addHeader();
        builder.startElement("shape");
        builder.addParam("side1", "6", true);
        builder.addParam("side2", "3", true);
        builder.addParam("side2", "2", false);
        builder.endElement("shape", false);
        System.out.println(builder.getResult().toString());
        return builder.getResult();
    }
}
