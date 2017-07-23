package com.ponagayba;


import com.ponagayba.converter.ConverterFactory;
import com.ponagayba.converter.XMLConverter;
import com.ponagayba.format.XML;
import com.ponagayba.model.group.Group;
import com.ponagayba.model.shape.*;

public class Demo {

    public static void main(String[] args) {
        Group group = new Group();
        Circle circle = ShapeFactory.getInstance().getCircle();
        circle.setRadius(5.0);
        group.addShape(circle);
        XMLConverter xmlConverter = ConverterFactory.getInstance().getXMLConverter();
        XML groupXml = xmlConverter.convert(group);
        System.out.println(groupXml);
    }
}
