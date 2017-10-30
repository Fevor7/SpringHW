package by.it.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import by.it.bean.Cat;

public interface CatRepository extends CrudRepository<Cat, Long> {

	List<Cat> findByName (String name);
	
	List<Cat> findByAgeBetweenAndNameEndingWith(int args1, int args2, String nameEndWith);
	
	List<Cat> findByOrderByNameDesc();
	
	List<Cat> findByOrderByNameAsc();
}
