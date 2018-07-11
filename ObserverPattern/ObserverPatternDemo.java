package ObserverPattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		ISubject subject = new RequestGrabber();
		IObserver observer = new StockObserver(subject);
		observer.update(100, 300);
	}
}
