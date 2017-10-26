package by.it.bean3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class Work {

	@Pointcut("execution(* by.it.bean3.TaskService.performJob())")
	public void perfomance() {

	}

	@Pointcut("execution(* by.it.bean3.TaskService.performJob(String)) && args(name)")
	public void intercept(String name) {
	}

	@Pointcut("execution(* by.it.bean3.TaskService.performExceptionJob())")
	public void perfomanceExcption() {

	}

	@Before("perfomance()")
	public void beforeWork() {
		System.out.println("Execution before work");
	}

	@AfterReturning("perfomance()")
	public void afterWork() {
		System.out.println("Execution after work");
	}

	@AfterThrowing("perfomanceExcption()")
	public void afterWorkproblems() {
		System.out.println("Execution after work problems");
	}

	@Around("perfomance()")
	public void aroundWork(ProceedingJoinPoint joinPoint) {
		try {
			System.out.println("Start");
			System.out.println("Begin Time" + System.currentTimeMillis());
			String result = (String) joinPoint.proceed();
			System.out.println("Finish Time" + System.currentTimeMillis());
			System.out.println("Status: " + result);
		} catch (Throwable e) {
			e.getMessage();
		}

	}

	@Before("intercept(name)")
	public void interceptWorkName(String name) {
		System.out.println("Intercepted work is " + name);
	}

}
