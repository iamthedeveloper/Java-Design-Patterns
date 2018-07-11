package DecoratortDesignPattern;

public class MozarellaDecorator extends PizzaDecorator{

	public MozarellaDecorator(IPizza newPizza) {
		super(newPizza);
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription() + "Mozarella !";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + .50;
	}

}
