package com.ponagayba.converter;


import com.ponagayba.util.DoubleNode;

import java.util.List;

public interface Convertible {

    String rootName();

    List<DoubleNode<String, Object>> getParams();
}
