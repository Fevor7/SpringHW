package by.it.loader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.it.bean.ConstructorBean;
import by.it.bean.Person;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("personContext.xml");
		Person person = (Person)context.getBean("person", Person.class);
		person.perform();
		System.out.println(person.getAddress().getStreet());
		ConstructorBean constrBean = (ConstructorBean) context.getBean("constructorBean", ConstructorBean.class);
		((ClassPathXmlApplicationContext)context).close();
	}

}
