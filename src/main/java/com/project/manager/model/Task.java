package com.project.manager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tasks")
public class Task implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * Many to one Mapping example
	 * 
	 * @ManyToOne(cascade=CascadeType.ALL)
	 * 
	 * @JoinColumn(name="PROJECT",referencedColumnName="PROJECT_ID")
	 * 
	 * @PrimaryKeyJoinColumn
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TASK_ID")
	private Integer taskId;

	@Column(name = "TASK")
	private String task;

	@Column(name = "PRIORITY")
	private Integer priority;

	@Column(name = "PARENT_TASK")
	private boolean parentTask;

	@Column(name = "PROJECT_NAME")
	private String projectName;

	@Column(name = "START_DATE")
	private String startDate;

	@Column(name = "END_DATE")
	private String endDate;

	@Column(name = "USER_NAME")
	private String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public String getProject() {
		return projectName;
	}

	public void setProject(String project) {
		this.projectName = project;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
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

}
