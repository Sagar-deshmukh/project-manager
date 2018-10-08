package com.project.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.manager.model.Project;
import com.project.manager.model.User;
import com.project.manager.service.EmployeeService;

@RestController
public class ProjectManagerController {

	@Autowired
	private EmployeeService employeeService;	
	
	@GetMapping("/addUser")
	public User addUser() {

		User user = new User();
		user.setFirstName("Sagar");
		user.setLastName("Deshmukh");
		user.setEmpID(62228);
		
		employeeService.save(user);			
		
		return user;
	}

	@GetMapping("/addProject")
	public Project addProject() {

		Project project = new Project();

		return project;
	}
	
	@GetMapping("/addTask")
	public User addTask() {

		User employee = new User();
		employee.setFirstName("Sagar");
		employee.setLastName("Deshmukh");

		return employee;
	}
	
	@GetMapping("/viewTask")
	public User viewTask() {

		User employee = new User();
		employee.setFirstName("Sagar");
		employee.setLastName("Deshmukh");

		return employee;
	}

}
