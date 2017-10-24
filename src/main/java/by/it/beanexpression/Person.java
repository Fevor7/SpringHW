package by.it.beanexpression;

import lombok.Data;

@Data
public class Person {

	private Long id;
	private String name;
	private String surname;
	private IAddress address;
	
}
