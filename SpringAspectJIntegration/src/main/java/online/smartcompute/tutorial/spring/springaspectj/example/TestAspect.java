package online.smartcompute.tutorial.spring.springaspectj.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspect {

	@Before("execution(* online.smartcompute.tutorial.spring.springaspectj.example.TestClass.testMethod(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println(
				"before " + joinPoint.getTarget().getClass().getName() + ":" + joinPoint.getSignature().getName());
	}

	@After("execution(* online.smartcompute.tutorial.spring.springaspectj.example.TestClass.testMethod(..))")
	public void afterFinally(JoinPoint joinPoint) {
		System.out.println("after finally " + joinPoint.getTarget().getClass().getName() + ":"
				+ joinPoint.getSignature().getName());
	}

	@AfterReturning("execution(* online.smartcompute.tutorial.spring.springaspectj.example.TestClass.testMethod(..))")
	public void afterReturning(JoinPoint joinPoint) {
		System.out.println("after returning " + joinPoint.getTarget().getClass().getName() + ":"
				+ joinPoint.getSignature().getName());
	}

	@AfterThrowing("execution(* online.smartcompute.tutorial.spring.springaspectj.example.TestClass.testMethod(..))")
	public void afterThrowing(JoinPoint joinPoint) {
		System.out.println("after throwing " + joinPoint.getTarget().getClass().getName() + ":"
				+ joinPoint.getSignature().getName());
	}

	@Around("execution(* online.smartcompute.tutorial.spring.springaspectj.example.TestClass.testMethod(..))")
	public Object around(ProceedingJoinPoint joinPoint) {
		System.out.println("around start " + joinPoint.getTarget().getClass().getName() + ":"
				+ joinPoint.getSignature().getName());
		Object obj = null;
		try {
			obj = joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(
				"around end " + joinPoint.getTarget().getClass().getName() + ":" + joinPoint.getSignature().getName());
		return obj;
	}

}