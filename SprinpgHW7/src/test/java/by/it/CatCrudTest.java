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
public class CatCrudTest {

	@Autowired
	CatRepository catRepository;
	@Before
	public void init() {
		catRepository.save(new Cat(null, "Matis", 11));
		catRepository.save(new Cat(null, "Proshka", 3));
		catRepository.save(new Cat(null, "Tomas", 4));
		catRepository.save(new Cat(null, "Geek", 1));
		catRepository.save(new Cat(null, "Grom", 2));
		catRepository.save(new Cat(null, "Basya", 7));
		catRepository.save(new Cat(null, "Masya", 2));
	}
	
	@Test
	public void crudRepositoryTest() {
		catRepository.findByName("Matis").forEach(System.out::println);
		catRepository.findByAgeBetweenAndNameEndingWith(3, 8, "a").forEach(System.out::println);
		catRepository.findByOrderByNameDesc().forEach(System.out::println);
		catRepository.findByOrderByNameAsc().forEach(System.out::println);
	}
	
}
