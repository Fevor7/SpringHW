package by.it.loader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.it.bean3.Person;

public class Main3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("personContext3.xml");
		Person person = (Person) context.getBean("person", Person.class);
		System.out.println(person);
		((ClassPathXmlApplicationContext) context).close();
	}
}
