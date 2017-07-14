package com.ponagayba.format.builder;

import com.ponagayba.format.Format;

public interface FormatBuilder {

    FormatBuilder addHeader();
    FormatBuilder startHolder(String name);
    FormatBuilder endHolder(String name, boolean next);
    FormatBuilder startElement(String name);
    FormatBuilder endElement(String name, boolean next);
    FormatBuilder addParam(String name, String value, boolean next);

    Format getResult();
}
