package com.project.manager.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.manager.model.Project;
import com.project.manager.model.User;

@RestController
public class ViewTaskController {

	/*@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/addProject")
	public Project addProject() {

		Project project = new Project();

		return project;
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/viewTask")
	public User viewTask() {

		User employee = new User();
		employee.setFirstName("Sagar");
		employee.setLastName("Deshmukh");

		return employee;
	}

	*/
}
