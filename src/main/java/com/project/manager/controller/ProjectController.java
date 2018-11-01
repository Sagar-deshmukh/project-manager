package com.project.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@PostMapping("/addProject")
	public List<Project> addProject(@RequestBody Project project ) {

		if (project.getProject() == null) {
			return this.getProjects();
		} else {
			projectService.save(project);
			return this.getProjects();
		}
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/updateProject")
	public List<Project> updateProject(@RequestBody Project project) {

		projectService.update(project);

		return this.getProjects();
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/suspendProject")
	public List<Project> suspendProject(@RequestBody Project project) {

		projectService.update(project);

		return this.getProjects();
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/searchManager")
	public List<Project> searchManager(@RequestBody Project project) {
		projectService.update(project);

		return this.getProjects();
	}

}
