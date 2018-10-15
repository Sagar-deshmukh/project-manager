/**
 * 
 */
package com.project.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.manager.dao.TaskDao;
import com.project.manager.model.Task;
import com.project.manager.service.TaskService;

/**
 * @author Admin
 *
 */
@Service
public class TaskServiceImp implements TaskService {

	@Autowired
	private TaskDao taskDao;

	@Transactional
	public void save(Task task) {
		taskDao.save(task);
	}

	@Transactional
	public void update(Task task) {
		taskDao.update(task);
	}
	
	@Transactional(readOnly = true)
	public List<Task> getAllTasks() {
		return taskDao.getAllTasks();
	}

}
