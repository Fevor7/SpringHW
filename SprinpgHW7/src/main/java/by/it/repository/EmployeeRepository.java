package by.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import by.it.bean.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
