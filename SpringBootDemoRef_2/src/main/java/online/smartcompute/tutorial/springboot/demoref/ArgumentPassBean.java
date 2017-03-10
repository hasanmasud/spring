package online.smartcompute.tutorial.springboot.demoref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ArgumentPassBean {
	@Autowired
	public ArgumentPassBean(ApplicationArguments args) {
		boolean debug = args.containsOption("debug");
		List<String> files = args.getNonOptionArgs();
		for(String x : files){
			System.out.println("GOD IS GREAT" + x);
		}
		// if run with "--debug logfile.txt" debug=true, files=["logfile.txt"]
	}
}