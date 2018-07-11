package BuilderPattern;

public class ChickenBurger extends GenericBurger{

	@Override
	public String name() {
		return "Chicken Burger"; 
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return (float) 5.00;
	}

}
