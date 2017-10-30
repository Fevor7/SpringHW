package by.it;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.it.bean.Department;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/TestSpringData.xml")
public class QueryByExampleTest {
	
	@Autowired
	QueryByExampleExecutor<Department> departmentRepository;

	@Test
	public void findByExampleTest() {
		System.out.println(departmentRepository.findOne(Example.of(new Department(null, "economical", null))));
		List<Department> list =  (List<Department>) departmentRepository.findAll(
				Example.of(new Department(null, "opment", null), ExampleMatcher.matching()
						.withIgnoreCase()
						.withStringMatcher(ExampleMatcher.StringMatcher.ENDING)));
		list.forEach(System.out::println);
	}
	
}
