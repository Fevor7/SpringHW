package by.it;

import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.it.bean.Employee;
import by.it.repository.DepartmentRepository;
import by.it.repository.EmployeePagingRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/TestSpringData.xml")
public class PageableTest {
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	EmployeePagingRepository employeeRepository;

	@Test
	public void pageableTest() {
		List<Long> ids = Stream.of(2L, 3L, 4L).collect(Collectors.toList());
		Page<Employee> employeesPage = employeeRepository.findByDepartmentIdIn(ids,
				PageRequest.of(1, 3, Sort.Direction.DESC, "age"));
		employeesPage.getContent().forEach(System.out::println);
		employeesPage = employeeRepository.findByName("Sasha", PageRequest.of(0, 2, Sort.Direction.DESC, "age"));
		employeesPage.getContent().forEach(System.out::println);
		employeesPage = employeeRepository.findAll(PageRequest.of(0, 2, Sort.Direction.DESC, "age"));
		employeesPage.getContent().forEach(System.out::println);
		employeesPage = employeeRepository.findByDepartmentId(2L, PageRequest.of(0, 2, Sort.Direction.DESC, "age"));
		employeesPage.getContent().forEach(System.out::println);
		employeeRepository.findAll(new Sort(Sort.Direction.DESC, "department.departmentName")).forEach(System.out::println);

	}

}
