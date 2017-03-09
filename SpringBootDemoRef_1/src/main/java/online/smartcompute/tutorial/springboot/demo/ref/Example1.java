package online.smartcompute.tutorial.springboot.demo.ref;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example1 {

	public static void main(String... agrs) {
		//System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(Example1.class, new String[] {});
	}

	@RequestMapping("/")
	public String sayHelllo(@RequestParam(name = "name") String name) {
		return "Hello " + name;
	}

}
