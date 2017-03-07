package online.smartcompute.tutorial.spring.annotationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MovieConfiguration {

	@Bean
	@Primary
	public MovieCatalog firstMovieCatalog() {
		return new MovieCatalog(1);
	}

	@Bean(name = "second")
	public MovieCatalog secondMovieCatalog() {
		return new MovieCatalog(2);
	}

	@Bean(name = "action")
	public MovieCatalog actionMovieCatalog() {
		return new MovieCatalog(3);
	}

	@Bean(name = "comedy")
	public MovieCatalog comedyCatalog() {
		return new MovieCatalog(4);
	}

}