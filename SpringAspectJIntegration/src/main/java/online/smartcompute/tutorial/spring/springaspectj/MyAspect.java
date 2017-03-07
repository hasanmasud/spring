package online.smartcompute.tutorial.spring.springaspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect("perthis(com.xyz.myapp.SystemArchitecture.businessService())")
public class MyAspect {
	private int someState;

	@Before("com.xyz.myapp.SystemArchitecture.businessService()")
	public void recordServiceUsage() {
		// ...
	}
}