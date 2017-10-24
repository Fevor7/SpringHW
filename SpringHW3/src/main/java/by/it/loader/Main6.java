package by.it.loader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.it.bean6.Person;

public class Main6 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("personContext6.xml");
		Person person = (Person) context.getBean("person", Person.class);
		System.out.println(person);
		((ClassPathXmlApplicationContext) context).close();
	}
	
}
