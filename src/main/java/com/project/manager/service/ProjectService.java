/**
 * 
 */
package com.project.manager.service;

import java.util.List;

import com.project.manager.model.Project;

/**
 * @author Admin
 *
 */
public interface ProjectService {

	List<Project> getProjects();

	void save(Project project);

	void remove(Project project);

	void update(Project project);

}
