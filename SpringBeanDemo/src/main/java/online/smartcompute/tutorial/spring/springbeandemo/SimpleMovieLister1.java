package online.smartcompute.tutorial.spring.springbeandemo;

public class SimpleMovieLister1 {

	// the SimpleMovieLister has a dependency on a MovieFinder
	private MovieFinder movieFinder;

	
	public void setMovieFinder(MovieFinder movieFinder){
		this.movieFinder = movieFinder;
	}
	
}
