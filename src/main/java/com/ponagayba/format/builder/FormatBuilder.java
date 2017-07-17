package com.ponagayba.format.builder;

import com.ponagayba.format.Format;

public interface FormatBuilder {

    FormatBuilder addHeader();
    FormatBuilder startArray(String name);
    FormatBuilder endArray(String name, boolean next);
    FormatBuilder startObject(String name);
    FormatBuilder endObject(String name, boolean next);
    FormatBuilder addParam(String name, Object value, boolean next);
    Format getResult();
}
