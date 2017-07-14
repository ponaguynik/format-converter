package com.ponagayba.converter;


import java.util.Map;

public interface Convertible {

    String rootName();

    Map<String, Object> getParams();
}
