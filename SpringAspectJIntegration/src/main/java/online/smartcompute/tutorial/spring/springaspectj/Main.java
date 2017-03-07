package online.smartcompute.tutorial.spring.springaspectj;

import org.springframework.aop.framework.ProxyFactory;

public class Main {
	public static void main(String[] args) {
		ProxyFactory factory = new ProxyFactory(new SimplePojo());
		factory.addInterface(Pojo.class);
		factory.addAdvice(new RetryAdvice());
		Pojo pojo = (Pojo) factory.getProxy();
		// this is a method call on the proxy!
		pojo.foo();
	}
}