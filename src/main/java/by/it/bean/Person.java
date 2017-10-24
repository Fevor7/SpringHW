package by.it.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
public class Person implements Executable, InitializingBean, DisposableBean {

	private static Person person = new Person();
	private String name;
	private String surname;
	private IAddress address;

	private Person() {
	}

	public static Person getInstance() {
		return person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void perform() {
		System.out.println("Hello: " + name);

	}

	// public void init() {
	// System.out.println("Initialization of Person");
	// }
	//
	// public void destroy() {
	// System.out.println("Destroy of Person");
	// }

	public void initMethod() {
		System.out.println("Init method");
	}

	public void destroyMethod() {
		System.out.println("Destroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization of Person(implements InitializingBean)");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy of Person(implements DisposableBean)");

	}
}
