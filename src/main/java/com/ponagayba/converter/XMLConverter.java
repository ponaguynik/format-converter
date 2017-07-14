package com.ponagayba.converter;

import com.ponagayba.format.XML;
import com.ponagayba.format.builder.FormatBuilderFactory;
import com.ponagayba.format.builder.XMLBuilder;

public class XMLConverter implements Converter {

    public XML convert(Convertible object) {
        XMLBuilder builder = FormatBuilderFactory.getInstance().getXMLBuilder();
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
