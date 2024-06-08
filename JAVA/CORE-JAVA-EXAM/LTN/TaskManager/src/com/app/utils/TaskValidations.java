package com.app.utils;

import java.time.LocalDate;

import com.app.entity.Status;
import com.app.entity.Task;

public class TaskValidations {
	
	public static Task validateInputs(String taskname, String description, String taskDate)
	{
		//Status st = parseAndValidateStatus(status);
		LocalDate tdate = parseTaskDate(taskDate);
		return new Task (taskname,description,tdate);
		
	}
	
	public static Status parseAndValidateStatus(String status)
	{
		return Status.valueOf(status.toUpperCase());
	}
	
	public static LocalDate parseTaskDate(String taskDate)
	{
		
		return LocalDate.parse(taskDate);
	}

}
