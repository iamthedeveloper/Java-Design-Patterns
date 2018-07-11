package BuilderPattern;

public abstract class GenericBurger implements Item{

	@Override
	public Package packing() {
		return new Wrap();
	}

}
