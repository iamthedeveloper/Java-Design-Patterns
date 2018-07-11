package CommandPattern;

public class ChooseCommand {

	Command command;

	public ChooseCommand(Command newCommand) {
		command = newCommand;
	}
	
	public void execute() {
		command.execute();
	}
}
