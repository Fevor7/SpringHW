package by.it.beanexpression;

import java.util.Collection;

import lombok.Data;

@Data
public class ExpressionBean {
	private Double multiplier;
	private String value;
	private Double count;
	private Boolean logic;
	private Collection<String> names;
	
}
