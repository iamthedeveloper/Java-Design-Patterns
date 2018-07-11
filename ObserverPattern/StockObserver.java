package ObserverPattern;

public class StockObserver implements IObserver {

	private float priceAAPL, priceGOOG;

	private ISubject subject;

	public StockObserver(ISubject subject) {
		subject.register(this);
	}

	@Override
	public void update(float priceAAPL, float priceGOOG) {
		this.priceAAPL = priceAAPL;
		this.priceGOOG = priceGOOG;
		printNewValues();
	}

	public void printNewValues() {
		System.out.println("AAPL: " + this.priceAAPL + "\n" + "GOOG: " + this.priceGOOG);
	}

}
