package online.smartcompute.tutorial.spring.annotationdemo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieRecommender {

	@Autowired
	@Qualifier("second")
	private MovieCatalog movieCatalog;

	@Autowired
	@Genre("action")
	private MovieCatalog actionCatalog;
	
	
	private MovieCatalog comedyMovieCatalog;
	
	

	/**
	 * @param comedyMovieCatalog the comedyMovieCatalog to set
	 */
	@Resource(name="comedy")
	public void setComedyMovieCatalog(MovieCatalog comedyMovieCatalog) {
		this.comedyMovieCatalog = comedyMovieCatalog;
	}

	/**
	 * @return the comedyMovieCatalog
	 */
	public MovieCatalog getComedyMovieCatalog() {
		return comedyMovieCatalog;
	}

	/**
	 * @return the actionCatalog
	 */
	public MovieCatalog getActionCatalog() {
		return actionCatalog;
	}

	/**
	 * @return the movieCatalog
	 */
	public MovieCatalog getMovieCatalog() {
		return movieCatalog;
	}

}