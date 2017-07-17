package com.ponagayba;


import com.ponagayba.converter.Converter;
import com.ponagayba.converter.ConverterFactory;
import com.ponagayba.format.JSON;
import com.ponagayba.format.XML;
import com.ponagayba.model.group.Group;
import com.ponagayba.model.shape.*;

public class Demo {

    public static void main(String[] args) {
        Group innerGroup = new Group();
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        innerGroup.addShape(shapeFactory.getCircle());
        innerGroup.addShape(shapeFactory.getSquare());
        innerGroup.addShape(shapeFactory.getTriangle());
        Group outerGroup = new Group();
        outerGroup.addShape(shapeFactory.getCircle());
        outerGroup.addShape(innerGroup);

        Converter xmlConverter = ConverterFactory.getInstance().getXMLConverter();
        XML xml = (XML) xmlConverter.convert(outerGroup);
        System.out.println(xml);

        Converter jsonConverter = ConverterFactory.getInstance().getJSONConverter();
        JSON json = (JSON) jsonConverter.convert(outerGroup);
        System.out.println(json);

        JSON json1 = (JSON) jsonConverter.convert(shapeFactory.getCircle());
        System.out.println(json1);
    }
}
