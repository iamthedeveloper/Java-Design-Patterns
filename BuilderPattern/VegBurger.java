package BuilderPattern;

public class VegBurger extends GenericBurger {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return (float) 3.50;
	}

}
