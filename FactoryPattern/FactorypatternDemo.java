package FactoryPattern;

public class FactorypatternDemo {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape circle = factory.getFactory(ShapeType.CIRCLE);
		circle.draw();
		Shape rectangle = factory.getFactory(ShapeType.RECTANGLE);
		rectangle.draw();
		
	}
}
