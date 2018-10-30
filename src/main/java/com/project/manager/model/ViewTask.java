package com.project.manager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ViewTasks")
public class ViewTask implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "view_Task_project_ID")
	private Integer projectsId;
		
	@Column(name = "TASK")
	private String task;
	
	@Column(name = "PRIORITY")
	private Integer priority;
	
//	@Column(name = "PARENT_TASK")
//	private boolean parentTask;
			
	@Column(name = "PROJECT")
	private String project;
	
	@Column(name = "START_DATE")
	private String startDate;
	
	@Column(name = "END_DATE")
	private Integer endDate;
		
	public Integer getProjectId() {
		return projectsId;
	}

	public void setProjectId(Integer projectId) {
		this.projectsId = projectId;
	}
	
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Integer getEndDate() {
		return endDate;
	}

	public void setEndDate(Integer endDate) {
		this.endDate = endDate;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

//	public boolean isParentTask() {
//		return parentTask;
//	}
//
//	public void setParentTask(boolean parentTask) {
//		this.parentTask = parentTask;
//	}

	/*public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}*/
	
}
