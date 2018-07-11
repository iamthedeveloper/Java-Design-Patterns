package AbstractFactory;

public class ShapeFactory implements AbstractaFactory {

	@Override
	public Shape getShapeFactory(ShapeConstants shapeType) {
		Shape shape = null;
		switch (shapeType) {
		case CIRCLE:
			shape = new Circle();
			break;
		case RECTANGLE:
			shape = new Rectangle();
			break;
		}
		return shape;

	}

	@Override
	public Color getColorFactory(ColorConstants colorType) {
		return null;
	}

}
