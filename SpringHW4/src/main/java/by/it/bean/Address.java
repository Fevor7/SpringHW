package by.it.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("address")
public class Address implements IAddress{

	@Value("1")
	private Long id;
	@Value("Lenina")
	private String street;
	@Value("Minsk")
	private String city;
	@Value("Belarus")
	private String country;
	
}
