package by.it.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import by.it.dao.Dao;
import by.it.service.IService;

@Service
public class BaseService<T> implements IService<T> {

	@Autowired
	private Dao<T> baseDao;

	@Autowired
	TransactionTemplate transactionTemplate;

	@Override
	public T add(T t) {
		return transactionTemplate.execute(new TransactionCallback<T>() {

			@Override
			public T doInTransaction(TransactionStatus arg0) {

				return baseDao.add(t);
			}

		});
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
		transactionTemplate.execute(new TransactionCallback<T>() {

			@Override
			public T doInTransaction(TransactionStatus arg0) {

				baseDao.delete(id);
				return null;
			}

		});

	}

}
