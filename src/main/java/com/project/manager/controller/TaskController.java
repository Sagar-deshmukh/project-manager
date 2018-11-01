package com.project.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.manager.model.Task;
import com.project.manager.service.TaskService;

@RestController
public class TaskController {

	@Autowired
	private TaskService taskService;

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addTask")
	public void addTask(@RequestBody Task task) {
		
		if (task.getTask() == null) {
			
		} else {
			taskService.save(task);
		}
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/updateTask")
	public Task updateTask(@RequestBody Task task) {
		taskService.update(task);
		return task;
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/projectSearch")
	public Task projectSearch(@RequestBody Task task) {

		return task;

	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/parentTaskSearch")
	public Task parentTaskSearch(@RequestBody Task task) {
		return task;
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/userSearch")
	public Task userSearch(@RequestBody Task task) {

		return task;
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/viewTask")
	public List<Task> viewTask() {
		return taskService.getAllTasks();
	}

}
