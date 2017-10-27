package by.it;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.it.entity.Employee;
import by.it.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-dao.xml")
public class DaoTest {
	
	@Autowired
	private EmployeeService baseDao;
	
	@Test
	public void saveTest() {
		Employee e = new Employee();
		e.setFirstName("Victor");
		e.setLastName("Grinko2");
		e = baseDao.add(e);
		//baseDao.delete(1L);
		Assert.assertEquals("Victor", baseDao.get(e.getId()).getFirstName());
	}
}
