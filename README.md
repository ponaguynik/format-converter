## Format Converter
Develop 3 simple classes that represent graphical shapes Triangle, Circle, Square and one Group class which will contains any number of graphical shapes including other groups.
Develop set of classes that is responsible for serialization your shapes-tree to XML and JSON format.

## Usage
To get a shape object from `model` package use `model.shape.ShapeFactory`.

To convert a shape object or a group of shapes (`model.group.Group`) you need to get suitable `converter.Converter` through `converter.ConverterFactory` and invoke `convert(Convertible c)` method.

## Example
```
Group group = new Group();
Circle circle = ShapeFactory.getInstance().getCircle();
circle.setRadius(5.0);
group.addShape(circle);
XMLConverter xmlConverter = ConverterFactory.getInstance().getXMLConverter();
XML groupXml = xmlConverter.convert(group);
```
