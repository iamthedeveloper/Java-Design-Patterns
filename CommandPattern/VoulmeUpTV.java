package CommandPattern;

public class VoulmeUpTV implements Command {

	ElectronicDevice device;

	public VoulmeUpTV(ElectronicDevice newDevice) {
		device = newDevice;
	}

	@Override
	public void execute() {
		device.volDown();
	}

}
