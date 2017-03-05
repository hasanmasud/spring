package online.smartcompute.tutorial.spring.springbeandemo;

public class ClassA {
	public static final ClassA INSTANCE = new ClassA();

	private ClassA() {
	}

	public static ClassA getInstance() {
		return INSTANCE;
	}
}
