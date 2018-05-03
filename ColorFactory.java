package AbstractFactory;

public class ColorFactory implements AbstractaFactory {

	@Override
	public Shape getShapeFactory(ShapeConstants shapeType) {
		return null;
	}

	@Override
	public Color getColorFactory(ColorConstants colorType) {
		Color color = null;
		switch (colorType) {
		case RED:
			color = new RedColor();
			break;
		case GREEN:
			color = new GreenColor();
			break;
		}
		return color;
	}

}
