package com.project.manager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tasks")
public class ViewTask {

	@Id
	@GeneratedValue
    @Column(name = "PROJECT_ID")
	private Integer projectId;
		
	@Column(name = "TASK")
	private String task;
	
	@Column(name = "PRIORITY")
	private Integer priority;
	
	@Column(name = "PARENT_TASK")
	private boolean parentTask;
			
	@Column(name = "PROJECT")
	private String project;
	
	@Column(name = "START_DATE")
	private String startDate;
	
	@Column(name = "END_DATE")
	private Integer endDate;
		
//	private User user;	

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
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

	public boolean isParentTask() {
		return parentTask;
	}

	public void setParentTask(boolean parentTask) {
		this.parentTask = parentTask;
	}

	/*public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}*/
	
}
