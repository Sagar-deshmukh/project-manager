package com.project.manager.dao.impl;

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
 
}