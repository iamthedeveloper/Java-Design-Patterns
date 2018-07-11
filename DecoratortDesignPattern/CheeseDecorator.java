package DecoratortDesignPattern;

public class CheeseDecorator extends PizzaDecorator{

	public CheeseDecorator(IPizza newPizza) {
		super(newPizza);
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + "Cheese !";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 1.50;
	}

}
