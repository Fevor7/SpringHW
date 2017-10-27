package by.it.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import by.it.dao.EmployeeDao;
import by.it.entity.Employee;

@Repository
public class EmployeeDaoImpl extends BaseDao<Employee> implements EmployeeDao{

	public EmployeeDaoImpl() {
		super();
		clazz = Employee.class;
	}

	@Override
	public List<Employee> getEmployee() {
		return getEm().createQuery("from Employee").getResultList();
	}
	
	
	

}
