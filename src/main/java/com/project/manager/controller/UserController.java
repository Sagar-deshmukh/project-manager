package com.project.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.manager.model.User;
import com.project.manager.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * This method retrieves all the users.
	 * 
	 * @return List of Users
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getUsers")
	public List<User> getUsers() {

		return userService.list();
	}

	/**
	 * This method add user to the record.
	 * 
	 * @return List of Users
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addUser")
	public List<User> addUser(@RequestBody User user) {

		if (user.getFirstName() == null || user.getLastName() == null || user.getEmpID() == null) {
			return this.getUsers();
		} else {
			userService.save(user);
			return this.getUsers();
		}
	}

	/**
	 * This method deletes the user from the record.
	 * 
	 * @return List of Users
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/deleteUser")
	public List<User> deleteUser(@RequestBody User user) {

		userService.remove(user);

		return userService.list();
	}

	/**
	 * This method deletes the user from the record.
	 * 
	 * @return List of Users
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/updateUser")
	public List<User> updateUser(@RequestBody User user) {

		userService.update(user);

		return userService.list();
	}

}
