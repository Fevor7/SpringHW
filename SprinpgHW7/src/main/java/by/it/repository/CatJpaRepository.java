package by.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import by.it.bean.Cat;

public interface CatJpaRepository extends JpaRepository<Cat, Long>{

}
