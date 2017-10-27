package by.it.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.it.entity.Employee;

@Repository
public class BaseDao implements Dao<Employee> {
	Class<Employee> clazz;
	ThreadLocal<EntityManager> em = new ThreadLocal<>();

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public Employee add(Employee t) {
		begin();
		getEm().persist(t);
		commit();
		return t;
	}

	@Override
	public Employee update(Employee t) {
		begin();
		getEm().merge(t);
		commit();
		return t;
	}

	@Override
	public Employee get(Serializable id) {
		return getEm().find(Employee.class, id);
	}

	@Override
	public void delete(Serializable id) {
		begin();
		Employee t = getEm().find(clazz, id);
		getEm().remove(t);
		commit();
	}

	public EntityManager getEm() {
		if (em.get() == null) {
			em.set(entityManagerFactory.createEntityManager());
		}
		return em.get();
	}
	
	public void begin() {
		getEm().getTransaction().begin();
	}
	
	public void commit() {
		getEm().getTransaction().commit();
	}

}
