package by.it.bean3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address implements IAddress{

	private Long id;
	private String street;
	private String city;

	
}