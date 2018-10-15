package com.project.manager.service;

import java.util.List;

import com.project.manager.model.User;

public interface UserService {
	void save(User employee);
	
	 List<User> list();
	 
	 void remove(User user);

     void update(User user);
}