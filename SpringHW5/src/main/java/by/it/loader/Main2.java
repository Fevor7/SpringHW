package by.it.loader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.it.bean3.TaskService;

public class Main2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context2.xml");
		TaskService bean = (TaskService) context.getBean("taskService");
		bean.performJob("Spring");
		bean.performJob();
		bean.performJobAround();
		try {
			bean.performExceptionJob();
		} catch (Exception e) {
			e.printStackTrace();
		}
		((ClassPathXmlApplicationContext) context).close();
	}
}
