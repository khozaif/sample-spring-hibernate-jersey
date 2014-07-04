package com.hashedin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name = "tasks")
@NamedQueries({ @NamedQuery(name = "Task.findAll", query = "SELECT t FROM Task t") })
public class Task
{

    @Id
    @GeneratedValue
    private Long taskId;
    
    private String taskName;
    private String taskPriority;
    private String taskDueDate;
    private String taskCloseDate;
    private String taskDescription;
    
    
    @ManyToOne 
    private Project projectId;
    
    @ManyToOne
    private Collabarators assignee;
    
    
	public Project getProjectId() {
		return projectId;
	}
	public void setProjectId(Project projectId) {
		this.projectId = projectId;
	}
	public Collabarators getAssignee() {
		return assignee;
	}
	public void setAssignee(Collabarators assignee) {
		this.assignee = assignee;
	}
	public Long getTaskId() {
		return taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskPriority() {
		return taskPriority;
	}
	public void setTaskPriority(String taskPriority) {
		this.taskPriority = taskPriority;
	}
	
	public String getTaskDueDate() {
		return taskDueDate;
	}
	public void setTaskDueDate(String taskDueDate) {
		this.taskDueDate = taskDueDate;
	}
	public String getTaskCloseDate() {
		return taskCloseDate;
	}
	public void setTaskCloseDate(String taskCloseDate) {
		this.taskCloseDate = taskCloseDate;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
    
 }
