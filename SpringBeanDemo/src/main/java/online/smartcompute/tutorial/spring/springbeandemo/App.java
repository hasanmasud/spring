package online.smartcompute.tutorial.spring.springbeandemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String... args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:config/demo/springbeandemo/applicationcontext.xml");

		SimpleMovieLister simpleMovieLister = context.getBean(SimpleMovieLister.class);
		SimpleMovieLister1 simpleMovieLister1 = context.getBean(SimpleMovieLister1.class);
		

		System.out.println(simpleMovieLister.getClass().getName());
		System.out.println(simpleMovieLister1);

		
		
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
