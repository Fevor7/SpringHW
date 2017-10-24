package by.it.bean2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Address implements IAddress{

	private Long id;
	private String street;
	private String city;
	private String country;
	public Address() {
		System.out.println("Address");
	}
	
	
}
