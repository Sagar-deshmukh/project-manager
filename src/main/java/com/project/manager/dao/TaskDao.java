package com.project.manager.dao;

import java.util.List;

import com.project.manager.model.Task;

public interface TaskDao {
   
	void save(Task task);
   
   List<Task> getAllTasks();

   void update(Task task);
}