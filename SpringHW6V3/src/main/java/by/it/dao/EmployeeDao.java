package by.it.dao;

import java.util.List;

import by.it.entity.Employee;

public interface EmployeeDao extends Dao<Employee>{
	List<Employee> getEmployee();
}
