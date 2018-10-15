/**
 * 
 */
package com.project.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.manager.dao.ProjectDao;
import com.project.manager.model.Project;
import com.project.manager.service.ProjectService;

/**
 * @author Admin
 *
 */
@Service
public class ProjectServiceImp implements ProjectService {

	@Autowired
	private ProjectDao projectDao;

	@Transactional
	public void save(Project user) {
		projectDao.save(user);
	}

	@Transactional(readOnly = true)
	public List<Project> getProjects() {
		return projectDao.getProjects();
	}

	@Transactional
	public void remove(Project project) {
		projectDao.remove(project);
	}

	@Transactional
	public void update(Project project) {
		projectDao.update(project);
	}

}
