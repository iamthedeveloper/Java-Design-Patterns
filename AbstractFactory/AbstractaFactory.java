package AbstractFactory;

public interface AbstractaFactory {

	Shape getShapeFactory(ShapeConstants shapeType);

	Color getColorFactory(ColorConstants colorType);
}
