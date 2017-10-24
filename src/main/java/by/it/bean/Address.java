package by.it.bean;

import lombok.Data;

@Data
public class Address implements IAddress {

	private Long id;
	private String street;
	private Long home;

	public void initMethod() {
		System.out.println("Init method(Address)");
	}

	public void destroyMethod() {
		System.out.println("Destroy method(Address)");
	}

}
