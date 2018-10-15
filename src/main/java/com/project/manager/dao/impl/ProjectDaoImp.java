/**
 * 
 */
package com.project.manager.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.manager.dao.ProjectDao;
import com.project.manager.model.Project;

/**
 * @author Admin
 *
 */
@Repository
public class ProjectDaoImp implements ProjectDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Project project) {
		sessionFactory.getCurrentSession().save(project);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Project> getProjects() {
		TypedQuery<Project> query = sessionFactory.getCurrentSession().createQuery("from Project");
		return query.getResultList();
	}

	@Override
	public void remove(Project project) {
		String sql = "DELETE FROM Projects WHERE PROJECT_ID = :PROJECT_ID";
		sessionFactory.getCurrentSession().createNativeQuery(sql).setParameter("PROJECT_ID", project.getProjectId())
				.executeUpdate();
	}

	@Override
	public void update(Project project) {
		sessionFactory.getCurrentSession().saveOrUpdate(project);

	}

}
