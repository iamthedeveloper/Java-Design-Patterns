package CommandPattern;

public class Television implements ElectronicDevice {

	@Override
	public void tunOn() {
		System.out.println("TV is On");
	}

	@Override
	public void tunOff() {
		System.out.println("TV is Off");
	}

	@Override
	public void volUp() {
		System.out.println("TV volume Up");
	}

	@Override
	public void volDown() {
		System.out.println("TV volume Down");
	}

}
