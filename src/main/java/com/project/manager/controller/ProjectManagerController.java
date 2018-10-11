package com.project.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.manager.model.Project;
import com.project.manager.model.User;
import com.project.manager.service.EmployeeService;

@RestController
public class ProjectManagerController {

	@Autowired
	private EmployeeService employeeService;
	
	
	/**This method retrieves all the users.
	 * @return List of Users 
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getUsers")
	public List<User> getUsers() {

		return employeeService.list();
	}
	
	/**This method add user to the record.
	 * @return List of Users 
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addUser")
	public List<User> addUser(@RequestBody User user) {

		employeeService.save(user);

		return this.getUsers();
	}

	/**This method deletes the user from the record.
	 * @return List of Users 
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/deleteUser")
	public List<User> deleteUser(@RequestBody User user) {

		employeeService.remove(user);

		return employeeService.list();
	}
	
	
	/**This method deletes the user from the record.
	 * @return List of Users 
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/updateUser")
	public List<User> updateUser(@RequestBody User user) {

		employeeService.update(user);

		return employeeService.list();
	}

	@CrossOrigin(origins = "http://localhost:4200")
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

}
