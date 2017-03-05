package online.smartcompute.tutorial.spring.springbeandemo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CommandManager implements ApplicationContextAware {

	private ApplicationContext context;

	public void executeCommand() {
		Command command = createCommand();
		command.execute();
	}

	private Command createCommand() {
		Command c = this.context.getBean("command", Command.class);
		return c;
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.context = arg0;
	}

}
