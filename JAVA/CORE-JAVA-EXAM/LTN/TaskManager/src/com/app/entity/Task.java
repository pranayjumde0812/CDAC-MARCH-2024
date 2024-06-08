package com.app.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
	
	private int id;
	private String taskname;
	private String description;
	private LocalDate taskDate;
	private Status status;
	private boolean active;
	private static int idgenerater = 1;
	
	public Task(String taskname, String description, LocalDate taskDate) {
		super();
		
		this.taskname = taskname;
		this.description = description;
		this.taskDate = taskDate;
		this.status = status.PENDING;
		this.active =true;
		this.id = idgenerater++;
		
	}
	

	public Task(int id) {
		this.id = id;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}


	@Override
	public String toString() {
		return "Task [id=" + id + ", taskname=" + taskname + ", description=" + description + ", taskDate=" + taskDate
				+ ", status=" + status + ", active=" + active + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return id == other.id;
	}
	
	
//	@Override
//	public boolean equals(Object o)
//	{
//		System.out.println("in task's equal");
//		if (o instanceof Task)
//		{
//			Task t = (Task)o;
//			return this.id==(t.id);
//			
//		}
//		return active;
//	}
	
	
	
	
	
		
	

}

