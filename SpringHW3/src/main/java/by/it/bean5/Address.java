package by.it.bean5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@AddressAnnotated
public class Address implements IAddress{

	private Long id;
	private String street;
	private Long home;

}