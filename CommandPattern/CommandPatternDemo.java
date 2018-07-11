package CommandPattern;

public class CommandPatternDemo {

	public static void main(String[] args) {
		ElectronicDevice device = new Television();
		Command command = new TurnTVOn(device);
		ChooseCommand chooseCommand = new ChooseCommand(command);
		chooseCommand.execute();

	}
}
