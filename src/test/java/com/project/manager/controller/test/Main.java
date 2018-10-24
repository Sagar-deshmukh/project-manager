package com.project.manager.controller.test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.project.manager.model.Project;
import com.project.manager.model.Task;


public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
					
			Project project = new Project();
			project.setManager("Sagar Deshmukh");
			project.setPriority(10);
			project.setProject("Project Manager");
	//		project.setProjectId(1L);
			
//			Project project2 = new Project();
//			project2.setManager("PK");
//			project2.setPriority(30);
			
			
			Task task = new Task();
			task.setParentTask(true);
			task.setPriority(100);
		//	task.setProject(project);
			task.setTask("First task");
			
			Task task2 = new Task();
			task2.setParentTask(true);
			task2.setPriority(30);
			task2.setTask("second task");
		//	task2.setProject(project);
			
			session.save(task);
			session.save(task2);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}