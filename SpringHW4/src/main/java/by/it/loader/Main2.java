package by.it.loader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import by.it.bean.Person;

public class Main2 {

	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(NoXmlConfiguration.class);
		Person person = context.getBean(Person.class);
		System.out.println(person);
		((AnnotationConfigApplicationContext)context).close();
	}
}
