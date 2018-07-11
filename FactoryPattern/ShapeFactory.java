package FactoryPattern;

public class ShapeFactory {

	private Shape shape;

	public Shape getFactory(ShapeType shapeType) {
		switch (shapeType) {
		case CIRCLE:
			 shape = new CircleShape();
			break;
		case RECTANGLE:
			 shape = new RectangleShape();
			break;
		}
		return shape;
	}
}
