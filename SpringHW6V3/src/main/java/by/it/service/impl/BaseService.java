package by.it.service.impl;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.it.dao.Dao;
import by.it.service.IService;

@Service
@Transactional
public class BaseService<T> implements IService<T> {

	@Autowired
	private Dao<T> baseDao;

	@Override
	public T add(T t) {
		return baseDao.add(t);
	}

	@Override
	public T update(T t) {
		return null;
	}

	@Override
	public T get(Serializable id) {
		return baseDao.get(id);
	}

	@Override
	public void delete(Serializable id) {
		baseDao.delete(id);
	}

}
