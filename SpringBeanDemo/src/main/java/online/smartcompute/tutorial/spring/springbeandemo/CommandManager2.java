package online.smartcompute.tutorial.spring.springbeandemo;

import org.springframework.beans.factory.annotation.Lookup;

public abstract class CommandManager2 {

	public void executeCommand() {
		Command command = createCommand();
		command.execute();
	}
	
	@Lookup("command")
	protected abstract Command createCommand();
}
