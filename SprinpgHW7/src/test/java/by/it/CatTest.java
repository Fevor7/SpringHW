package by.it;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.it.bean.Cat;
import by.it.repository.CatRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/TestSpringData.xml")
public class CatTest {

	@Autowired
	CatRepository catRepository;
	@Before
	public void init() {
		catRepository.save(new Cat(null, "Matis", 11));
		
	}
	
	@Test
	public void crudRepositoryTest() {
		System.out.println(catRepository.existsById(1L));
		Cat cat = catRepository.findById(1L).orElseGet(null);
		System.out.println(cat);
		cat.setAge(12);
		catRepository.save(cat);
		System.out.println(cat);
		catRepository.delete(cat);
		System.out.println(catRepository.existsById(1L));
	}
	
}
