package online.smartcompute.tutorial.springboot.demo.ref;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {

	public static void main(String... agrs) {
		SpringApplication.run(Example.class, new String[] {});
	}

	@RequestMapping("/")
	public String sayHelllo() {
		return "Hello World";
	}

}
