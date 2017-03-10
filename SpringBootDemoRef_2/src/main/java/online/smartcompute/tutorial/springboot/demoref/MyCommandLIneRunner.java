package online.smartcompute.tutorial.springboot.demoref;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLIneRunner implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("GOD IS GREAT : running something before the actual run");
	}

}
