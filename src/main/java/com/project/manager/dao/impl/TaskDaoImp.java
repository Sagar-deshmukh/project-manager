/**
 * 
 */
package com.project.manager.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.manager.dao.TaskDao;
import com.project.manager.model.Task;

/**
 * @author Admin
 *
 */
@Repository
public class TaskDaoImp implements TaskDao{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Task task) {
		sessionFactory.getCurrentSession().save(task);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Task> getAllTasks() {
		TypedQuery<Task> query = sessionFactory.getCurrentSession().createQuery("from Task");
		return query.getResultList();
	}

	@Override
	public void update(Task task) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(task);
		
	}
	
}
