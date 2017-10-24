package by.it.bean2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressImpl implements IAddress{
	
	private Long id;
	private String street;
	private String city;
	
	public AddressImpl() {
		System.out.println("AddressImpl");
	}

}
