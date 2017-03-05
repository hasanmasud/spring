package online.smartcompute.tutorial.spring.springbeandemo;

import java.beans.ConstructorProperties;

public class ConstructorPropertiesDemo1 {
	
	// Number of years to calculate the Ultimate Answer
	private int years;
	
	// The Answer to Life, the Universe, and Everything
	private String ultimateAnswer;

	@ConstructorProperties({"years", "ultimateAnswer"})
	public ConstructorPropertiesDemo1(int years, String ultimateAnswer) {
		this.years = years;
		this.ultimateAnswer = ultimateAnswer;
	}

}