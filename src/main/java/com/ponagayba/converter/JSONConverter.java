package com.ponagayba.converter;

import com.ponagayba.format.JSON;
import com.ponagayba.format.builder.FormatBuilder;
import com.ponagayba.format.builder.FormatBuilderFactory;
import com.ponagayba.util.DoubleNode;

import java.util.List;

public class JSONConverter implements Converter {

    private FormatBuilder builder;

    JSONConverter() {
        builder = FormatBuilderFactory.getInstance().getJSONBuilder();
    }

    @Override
    public JSON convert(Convertible object) {
        builder.startObject(null);
        fillUp(object, false, false);
        builder.endObject("name", false);
        return (JSON) builder.getResult();
    }

    private void fillUp(Convertible object, boolean hasNext, boolean container) {
        if (object instanceof Container) {
            builder.startArray(object.rootName());
            build(object, true);
            builder.endArray(object.rootName(), hasNext);
        } else {
            if (container)
                builder.startObject(null);
            else
                builder.startObject(object.rootName());
            build(object, false);
            builder.endObject(object.rootName(), hasNext);
        }
    }

    private void build(Convertible object, boolean container) {
        List<DoubleNode<String, Object>> params = object.getParams();
        boolean hasNext = true;
        for (int i = 0; i < params.size(); i++) {
            if (i == params.size() - 1)
                hasNext = false;
            if (params.get(i).getSecond() instanceof Convertible)
                fillUp((Convertible) params.get(i).getSecond(), hasNext, container);
            else
                builder.addParam(params.get(i).getFirst(), params.get(i).getSecond(), hasNext);
        }
    }
}
