package com.ponagayba.converter;

import com.ponagayba.format.Format;

public interface Converter {

    Format convert(Convertible object);
}
