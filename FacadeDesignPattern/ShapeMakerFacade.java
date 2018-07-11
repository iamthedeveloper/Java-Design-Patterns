package FacadeDesignPattern;

public class ShapeMakerFacade {

	private Shape circle, rectangle, square;
	
	public ShapeMakerFacade () {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
	public void drawRectangle() {
		rectangle.draw();
	}
}
