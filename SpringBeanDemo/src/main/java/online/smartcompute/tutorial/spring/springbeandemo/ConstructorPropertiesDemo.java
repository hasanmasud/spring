package online.smartcompute.tutorial.spring.springbeandemo;

public class ConstructorPropertiesDemo {
	
	// Number of years to calculate the Ultimate Answer
	private int years;
	
	// The Answer to Life, the Universe, and Everything
	private String ultimateAnswer;

	public ConstructorPropertiesDemo(int years, String ultimateAnswer) {
		this.years = years;
		this.ultimateAnswer = ultimateAnswer;
	}

}