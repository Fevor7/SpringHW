package by.it.loader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.it.bean4.Person;

public class Main4 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("personContext4.xml");
		Person person = (Person) context.getBean("person", Person.class);
		System.out.println(person);
		((ClassPathXmlApplicationContext) context).close();
	}
}
