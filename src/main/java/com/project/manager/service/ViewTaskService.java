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
public interface ViewTaskService {

	List<Task> getTasks();

	void save(Task viewTask);

	void remove(Task viewTask);

	void update(Task viewTask);

}
