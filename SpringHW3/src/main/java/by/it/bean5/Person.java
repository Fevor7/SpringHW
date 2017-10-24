package by.it.bean5;

import org.springframework.beans.factory.annotation.Autowired;

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
	@Company
	private IAddress address;


}