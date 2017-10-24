package by.it.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("person")
public class Person {
	@Value("1")
	private Integer id;
	@Value("Victor")
	private String name;
	@Value("Grinko")
	private String surname;
	@Value("#{address}")
	private IAddress address;
	
	
}
