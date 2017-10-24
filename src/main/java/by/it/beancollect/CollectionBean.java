package by.it.beancollect;

import java.util.Collection;
import java.util.Set;

import lombok.Data;

@Data
public class CollectionBean {

	private Set<String> names;
	private Collection<String> cars;
	private String[] cities;

}
