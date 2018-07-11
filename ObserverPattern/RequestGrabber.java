package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class RequestGrabber implements ISubject {

	float priceAAPL, priceGOOG;

	List<IObserver> observers;

	public RequestGrabber() {
		observers = new ArrayList<IObserver>();
	}

	@Override
	public void register(IObserver o) {

		observers.add(o);
	}

	@Override
	public void unRegister(IObserver o) {
		observers.remove(o);

	}

	@Override
	public void notifyAllObservers() {
		for (IObserver observer : observers) {
			observer.update(priceAAPL, priceGOOG);
		}
	}

	public void setPriceAAPL(float priceAAPL) {
		this.priceAAPL = priceAAPL;
		notifyAllObservers();
	}

	public void setPriceGOOG(float priceGOOG) {
		this.priceGOOG = priceGOOG;
		notifyAllObservers();
	}

}
