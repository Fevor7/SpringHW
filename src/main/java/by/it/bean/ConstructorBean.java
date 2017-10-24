package by.it.bean;

public class ConstructorBean {

	private String name;

	private ConstructorBean(String name) {
		this.name = name;
		System.out.println(this.name);
	}

	private ConstructorBean() {
	}

}
