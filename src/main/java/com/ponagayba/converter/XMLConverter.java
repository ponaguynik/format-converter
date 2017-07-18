package com.ponagayba.converter;

import com.ponagayba.format.XML;
import com.ponagayba.format.builder.FormatBuilder;
import com.ponagayba.format.builder.FormatBuilderFactory;
import com.ponagayba.util.DoubleNode;

import java.util.List;

public class XMLConverter implements Converter {

    private FormatBuilder builder;

    XMLConverter() {
        builder = FormatBuilderFactory.getInstance().getXMLBuilder();
    }

    @Override
    public XML convert(Convertible object) {
        builder.addHeader();
        fillUp(object);
        return (XML) builder.getResult();
    }

    private void fillUp(Convertible object) {
        if (object instanceof Container) {
            builder.startArray(object.rootName());
            build(object);
            builder.endArray(object.rootName(), false);
        } else {
            builder.startObject(object.rootName());
            build(object);
            builder.endObject(object.rootName(), false);
        }
    }

    private void build(Convertible object) {
        List<DoubleNode<String, Object>> params = object.getParams();
        for (DoubleNode<String, Object> param : params) {
            if (param.getSecond() instanceof Convertible)
                fillUp((Convertible) param.getSecond());
            else
                builder.addParam(param.getFirst(), param.getSecond().toString(), false);
        }
    }
}
