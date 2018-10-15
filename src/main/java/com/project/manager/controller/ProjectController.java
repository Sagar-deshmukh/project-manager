package com.project.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.manager.model.Project;
import com.project.manager.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getProjects")
	public List<Project> getProjects() {

		return projectService.getProjects();

	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/addProject")
	public Project addProject() {

		Project project = new Project();

		return project;
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/updateProject")
	public Project updateProject() {

		Project project = new Project();

		return project;
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/suspendProject")
	public Project suspendProject() {

		Project project = new Project();

		return project;
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/searchProject")
	public Project searchProject() {

		Project project = new Project();

		return project;
	}

}
