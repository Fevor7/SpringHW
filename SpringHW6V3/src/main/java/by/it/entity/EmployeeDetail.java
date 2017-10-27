package by.it.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"employee"})
@ToString(exclude = {"employee"})
@Entity
public class EmployeeDetail implements Serializable{

	private static final long serialVersionUID = 4381646708963295452L;
	@Id
	@GenericGenerator(name = "one-one",
			strategy = "foreign",
			parameters = @Parameter (name = "property", value = "employee"))
	@GeneratedValue(generator = "one-one")
	private Long id;
	private String street;
	private String city;
	private String state;
	private String country;
	@OneToOne(fetch = FetchType.EAGER)
	@PrimaryKeyJoinColumn
	private Employee employee;
	
	
}
