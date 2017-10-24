package by.it.bean3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	private Long id;
	private String name;
	private String surname;
	private IAddress address;
	
	public Person(IAddress address) {
		super();
		this.address = address;
	}
	
	
}
