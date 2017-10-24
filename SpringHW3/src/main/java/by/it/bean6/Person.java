package by.it.bean6;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Provider;

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
//	@Inject
//	@AddressAnnotated
	private Set<IAddress> address;
	
	public Person(Provider<IAddress> addressPro) {
		address = new HashSet<IAddress>();
		for (int i = 0; i<5; i++) {
			address.add(addressPro.get());
		}
		
	}

	public Set<IAddress> getAddress() {
		return address;
	}

//	@Inject
//	@AddressAnnotated
//	@Company
	//@Named("companyAddress")
	public void setAddress(Set<IAddress> address) {
		this.address = address;
	}
	
	


}