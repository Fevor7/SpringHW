package by.it.beanexpression;

import java.util.Collection;
import java.util.Set;

import lombok.Data;

@Data
public class CollectionBeanExp {

	private Set<String> names;
	private Collection<String> cars;
	private Collection<Person> persons;
	private String[] cities;
}
