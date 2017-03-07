package online.smartcompute.tutorial.spring.springaspectj;

import org.springframework.aop.framework.AopContext;

public class SimplePojo implements Pojo {
	public void foo() {
		// this works, but... gah!
		((Pojo) AopContext.currentProxy()).bar();
	}

	public void bar() {
		// some logic...
	}
}
