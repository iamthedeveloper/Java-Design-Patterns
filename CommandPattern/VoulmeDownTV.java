package CommandPattern;

public class VoulmeDownTV implements Command {

	ElectronicDevice device;

	public VoulmeDownTV(ElectronicDevice newDevice) {
		device = newDevice;
	}

	@Override
	public void execute() {
		device.volDown();
	}

}
