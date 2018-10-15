package com.project.manager.dao;

import java.util.List;

import com.project.manager.model.User;

public interface TaskDao {
   void save(User user);
   
   List<User> list();

   void remove(User user);

   void update(User user);
}