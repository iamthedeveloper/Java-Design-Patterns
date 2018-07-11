package BridgePattern;

public abstract class IShapeAPI {

	protected IDrawAPI drawAPI;

	public IShapeAPI(IDrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	abstract void draw();
}
