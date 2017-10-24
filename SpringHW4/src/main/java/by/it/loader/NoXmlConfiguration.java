package by.it.loader;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

import by.it.bean.Address;
import by.it.bean.Person;

@Configuration
@ComponentScan(basePackages = "by.it.bean",
		excludeFilters = {@ComponentScan.Filter(
				value=Component.class,
				type = FilterType.ANNOTATION,
				pattern = {}
			)}
		)
public class NoXmlConfiguration {
	@Bean
	public Person person() {
		return new Person();
	}
	@Bean
	public Address address() {
		return new Address();
	}
	
}
