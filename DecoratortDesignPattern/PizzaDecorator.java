package DecoratortDesignPattern;

public class PizzaDecorator implements IPizza {

	IPizza pizza;

	public PizzaDecorator(IPizza newPizza) {
		pizza = newPizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription();
	}

	@Override
	public double getCost() {
		return pizza.getCost();
	}
}
