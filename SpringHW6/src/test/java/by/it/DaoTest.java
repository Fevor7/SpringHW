package by.it;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.it.dao.Dao;
import by.it.entity.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-dao.xml")
public class DaoTest {
	
	@Autowired
	private Dao<Employee> baseDao;
	
	@Test
	public void saveTest() {
		Employee e = new Employee();
		e.setFirstName("Victor");
		e.setLastName("Grinko");
		e = baseDao.add(e);
		Assert.assertEquals("Victor", baseDao.get(e.getId()).getFirstName());
	}
}
