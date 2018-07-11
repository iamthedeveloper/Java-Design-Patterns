package BuilderPattern;

public abstract class ColdDrink implements Item {

	@Override
	public Package packing() {

		return new Bottle();
	}

}
