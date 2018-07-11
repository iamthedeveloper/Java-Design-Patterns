package CommandPattern;

public class TurnTVOn implements Command{

	ElectronicDevice device;
	public TurnTVOn(ElectronicDevice newDevice) {
		device = newDevice;
	}
	@Override
	public void execute() {
		device.tunOn();
	}

}
