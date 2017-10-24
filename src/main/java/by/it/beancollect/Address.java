package by.it.beancollect;

import java.util.Collection;

import org.apache.log4j.Logger;

import lombok.Data;

@Data
public class Address implements IAddress {

	private static Logger Log = Logger.getLogger(Address.class);
	private Long id;
	private String street;
	private Long home;
	private Collection<String> flats;
	

	public Collection<String> getFlats() {
		return flats;
	}

	public void setFlats(Collection<String> flats) {
		this.flats = flats;
	}

}
