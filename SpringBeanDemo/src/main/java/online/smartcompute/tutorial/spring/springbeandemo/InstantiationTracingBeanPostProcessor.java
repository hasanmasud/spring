package online.smartcompute.tutorial.spring.springbeandemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("after initialization of " + beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("before initialization of " + beanName);
		return bean;
	}


}
