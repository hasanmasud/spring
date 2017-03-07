package online.smartcompute.tutorial.spring.annotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemoTest {

	public static void main(String... args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("online.smartcompute.tutorial.spring.annotationdemo");

		MovieRecommender movieRecommender = context.getBean(MovieRecommender.class);
		
		
		System.out.println(movieRecommender.getMovieCatalog().getNumber());
		
		
		System.out.println(movieRecommender.getActionCatalog().getNumber());
		
		
		System.out.println(movieRecommender.getComedyMovieCatalog().getNumber());
		
		((AnnotationConfigApplicationContext) context).close();
	}
}
