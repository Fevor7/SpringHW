package by.it.bean2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressImpl2 implements IAddress{
	
	private Long id;
	private String street;
	private String city;
	
	public AddressImpl2() {
		System.out.println("AddressImpl2");
	}

}

