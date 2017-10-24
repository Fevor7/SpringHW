package by.it.bean4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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
	@Autowired
	@Qualifier("address")
	private IAddress address;
	@Autowired(required = false)
	private Car car; 

}
