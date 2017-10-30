package by.it;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.it.bean.Department;
import by.it.bean.Employee;
import by.it.repository.DepartmentRepository;
import by.it.repository.EmployeeRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/TestSpringData.xml")
public class QueryJpaTest {

	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Before
	public void  init() {
		Department department = new Department(null, "economical", null);
		Department department2 = new Department(null, "development", null);
		Employee e = new Employee(null, "Sasha", 28, department);
		Employee e1 = new Employee(null, "Sasha", 42, department);
		Employee e2 = new Employee(null, "Sasha", 30, department);
		Employee e3 = new Employee(null, "Sasha", 28, department2);
		Employee e4 = new Employee(null, "Sasha", 24, department2);
		Employee e5 = new Employee(null, "Yana2", 23, department2);
		Set<Employee> set = new HashSet<>();
		set.add(e);
		set.add(e1);
		set.add(e2);
		Set<Employee> set2 = new HashSet<>();
		set2.add(e3);
		set2.add(e4);
		set2.add(e5);
		department.setEmployees(set);
		department2.setEmployees(set2);
		employeeRepository.save(e);
		employeeRepository.save(e1);
		employeeRepository.save(e2);
		employeeRepository.save(e3);
		employeeRepository.save(e4);
		employeeRepository.save(e5);
		departmentRepository.save(department);
		departmentRepository.save(department2);
		
	}

	@Test
	public void queryTest() {
		departmentRepository.getByJoinCondition("Sasha").forEach(System.out::println);
		departmentRepository.getByEmployeesLastName("Shi").forEach(System.out::println);
		departmentRepository.getByMaxAge().forEach(System.out::println);
	}


}
