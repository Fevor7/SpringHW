package by.it.loader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.it.bean2.TaskService;

public class Main {

		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
			TaskService bean = (TaskService) context.getBean("taskService");
			bean.jobAround("Spring2");
			bean.jobAround("disable");
			bean.performJob("Spring", "Hibernate");
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
