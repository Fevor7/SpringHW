package by.it.beanexpression;

import java.util.Collection;

import lombok.Data;

@Data
public class Address implements IAddress{

	private Long id;
	private String home;
	private String street;
	private Collection<Long> flats;
	private String value;
		
}
