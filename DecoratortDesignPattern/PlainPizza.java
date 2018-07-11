package DecoratortDesignPattern;

public class PlainPizza implements IPizza {

	@Override
	public String getDescription() {
		return "Palin Pizza";
	}

	@Override
	public double getCost() {
		return 4.0;
	}

	
}
