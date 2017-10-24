package by.it.bean6;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@AddressAnnotated
public class Address implements IAddress{

	private Long id;
	@Value("Lenina2")
	private String street;
	private Long home;

}
