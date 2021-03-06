package by.it.bean2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("work")
public class Work {

	public void beforeWork() {
		System.out.println("Execution before work");
	}

	public void afterWork() {
		System.out.println("Execution after work");
	}

	public void afterWorkproblems() {
		System.out.println("Execution after work problems");
	}

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
	
	public void aroundWork2(ProceedingJoinPoint joinPoint, String name) {
		try {
			if(!"disable".equals(name)) {
				joinPoint.proceed();
			} 	
			System.out.println(" aspect: "+name);
		} catch (Throwable e) {
			e.getMessage();
		}
	}

	public void interceptWorkName(String name, String name2) {
		System.out.println("Intercepted work is " + name+" "+name2);
	}
}
