package com.project.manager.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Tasks")
public class Task implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
    @Column(name = "TASK_ID")
	private Integer taskId;
		
	@Column(name = "TASK")
	private String task;
	
	@Column(name = "PRIORITY")
	private Integer priority;
	
	@Column(name = "PARENT_TASK")
	private boolean parentTask;
	
	//Many to one Mapping example
	@ManyToOne(cascade=CascadeType.ALL)
    //@JoinColumn(name="PROJECT",referencedColumnName="PROJECT_ID")
	//@PrimaryKeyJoinColumn
	private Project project;
	
	@Column(name = "START_DATE")
	private String startDate;
	
	@Column(name = "END_DATE")
	private Integer endDate;
		
	public Integer getProjectId() {
		return taskId;
	}

	public void setProjectId(Integer projectId) {
		this.taskId = projectId;
	}
	
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
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
	
}
