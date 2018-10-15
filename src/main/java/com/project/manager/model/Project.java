package com.project.manager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Projects")
public class Project {

	@Id
	@GeneratedValue
    @Column(name = "PROJECT_ID")
	private Integer projectId;
	
	@Column(name = "MANAGER")
	private String manager;
	
	@Column(name = "PROJECT")
	private String project;
	
	@Column(name = "START_DATE")
	private String startDate;
	
	@Column(name = "END_DATE")
	private Integer endDate;
	
	@Column(name = "PRIORITY")
	private Integer priority;

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	
	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
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
	
}