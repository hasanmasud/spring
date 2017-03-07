package online.smartcompute.tutorial.spring.springaspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SampleAspect {

	
	@Pointcut("execution(public * *(..))") // any public method
	private void anyPublicOperation() {
		
	}
	
}
