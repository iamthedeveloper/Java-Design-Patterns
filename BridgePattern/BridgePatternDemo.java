package BridgePattern;

public class BridgePatternDemo {

	public static void main(String[] args) {
		DrawShape shape = new DrawShape(new SquareDrawer());
		shape.draw();
		
		shape = new DrawShape(new RectangleDrawer());
		shape.draw();
	}
}
