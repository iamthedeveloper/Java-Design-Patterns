package BridgePattern;

public class DrawShape extends IShapeAPI {

	public DrawShape(IDrawAPI drawAPI) {
		super(drawAPI);
	}

	@Override
	public void draw() {
		this.drawAPI.draw();
	}

}
