package by.it.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("companyAddress")
public class CompanyAddress implements IAddress{

	@Value("1")
	private Long id;
	@Value("Stalina")
	private String street;
	@Value("Gomel")
	private String city;
	@Value("Belarus")
	private String country;
	
}