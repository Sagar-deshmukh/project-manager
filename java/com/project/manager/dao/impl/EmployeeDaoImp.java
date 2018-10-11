package com.project.manager.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.manager.dao.EmployeeDao;
import com.project.manager.model.User;

@Repository
public class EmployeeDaoImp implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public List<User> list() {
		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
		return query.getResultList();
	}

	@Override
	public void remove(User user) {
		String sql = "DELETE FROM Users WHERE EMP_ID = :EMP_ID";
		sessionFactory.getCurrentSession().createNativeQuery(sql).setParameter("EMP_ID", user.getEmpID()).executeUpdate();
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		
	}
	
}