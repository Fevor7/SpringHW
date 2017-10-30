package by.it.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import by.it.bean.Employee;

public interface EmployeePagingRepository extends PagingAndSortingRepository<Employee, Long>{
	Page<Employee> findByDepartmentIdIn(List<Long> ids, Pageable pageable);
	Page<Employee> findByDepartmentId(Long id, Pageable pageable);
	Page<Employee> findByName(String name, Pageable pageable);

}
