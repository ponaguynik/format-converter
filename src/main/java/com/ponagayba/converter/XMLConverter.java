package com.ponagayba.converter;

import com.ponagayba.format.XML;
import com.ponagayba.format.builder.FormatBuilder;
import com.ponagayba.format.builder.FormatBuilderFactory;
import com.ponagayba.util.DoubleNode;

import java.util.List;

public class XMLConverter implements Converter {

    XMLConverter() {
    }

    @Override
    public XML convert(Convertible object) {
        FormatBuilder builder = FormatBuilderFactory.getInstance().getXMLBuilder();
        builder.addHeader();
        fillUp(object, builder);
        return (XML) builder.getResult();
    }

    private void fillUp(Convertible object, FormatBuilder builder) {
        if (object instanceof Container) {
            builder.startArray(object.rootName());
            build(object, builder);
            builder.endArray(object.rootName(), false);
        } else {
            builder.startObject(object.rootName());
            build(object, builder);
            builder.endObject(object.rootName(), false);
        }
    }

    private void build(Convertible object, FormatBuilder builder) {
        List<DoubleNode<String, Object>> params = object.getParams();
        for (DoubleNode<String, Object> param : params) {
            if (param.getSecond() instanceof Convertible)
                fillUp((Convertible) param.getSecond(), builder);
            else
                builder.addParam(param.getFirst(), param.getSecond().toString(), false);
        }
    }
}
