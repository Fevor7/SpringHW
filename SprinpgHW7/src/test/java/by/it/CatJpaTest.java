package by.it;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.it.bean.Cat;
import by.it.repository.CatJpaRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/TestSpringData.xml")
public class CatJpaTest {

	@Autowired
	CatJpaRepository catRepository;
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
		System.out.println(catRepository.existsById(1L));
		Cat cat = catRepository.getOne(1L);
		System.out.println(cat);
		cat.setName("New Name" + cat.getName());
		catRepository.saveAndFlush(cat);
		Cat newCat = catRepository.getOne(1L);
		System.out.println(newCat);

	}
	
}
