/**
 * 
 */
package com.project.manager.service;

import java.util.List;

import com.project.manager.model.Task;

/**
 * @author Admin
 *
 */
public interface TaskService {

	List<Task> getAllTasks();

	void save(Task task);

	void update(Task task);

}
