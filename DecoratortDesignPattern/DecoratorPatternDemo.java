package DecoratortDesignPattern;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		IPizza pizza = new MozarellaDecorator(new CheeseDecorator(new PlainPizza()));
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());
	}
}
