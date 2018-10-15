package com.project.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.manager.dao.UserDao;
import com.project.manager.model.User;
import com.project.manager.service.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userDao;

	@Transactional
	public void save(User user) {
		userDao.save(user);
	}

	@Transactional(readOnly = true)
	public List<User> list() {
		return userDao.list();
	}

	@Transactional
	public void remove(User user) {
		userDao.remove(user);
	}
	
	 @Transactional
	public void update(User user) {
		    userDao.update(user);
		   }
}
