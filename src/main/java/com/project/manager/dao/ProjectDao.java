package com.project.manager.dao;

import java.util.List;

import com.project.manager.model.Project;

public interface ProjectDao {
 void save(Project project);
   
   List<Project> getProjects();

   void remove(Project project);

   void update(Project project);
 
}