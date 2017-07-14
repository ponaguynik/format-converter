package com.ponagayba.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class FieldsParser {

    public static Map<String, Object> parse(Object object) {
        Map<String, Object> result = new HashMap<>();
        Field[] fields = object.getClass().getFields();
        for (Field field : fields) {
            try {
                result.put(field.getName(), field.get(object));
            } catch (IllegalAccessException ignore) {
            }
        }
        return result;
    }
}
