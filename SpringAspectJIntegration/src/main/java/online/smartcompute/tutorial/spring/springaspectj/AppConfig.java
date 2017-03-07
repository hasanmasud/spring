package online.smartcompute.tutorial.spring.springaspectj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 
 * @author Masud
 *
 */
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

	@Bean
	public AspectDemo getAspectDemo() {
		return new AspectDemo();
	}

	@Bean
	public TestBean getTestBean() {
		return new TestBean();
	}

}
