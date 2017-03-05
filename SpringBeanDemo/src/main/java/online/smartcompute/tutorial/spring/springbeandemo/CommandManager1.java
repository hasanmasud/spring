package online.smartcompute.tutorial.spring.springbeandemo;

public abstract class CommandManager1 {

	public void executeCommand() {
		Command command = createCommand();
		command.execute();
	}

	protected abstract Command createCommand();
}
