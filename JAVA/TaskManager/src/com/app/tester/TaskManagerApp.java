package com.app.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.entity.Status;
import com.app.entity.Task;
import com.app.ordering.OrderByTaskDate;
import com.app.utils.TaskUtils;
import com.app.utils.TaskValidations;

public class TaskManagerApp {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in))
		{
			boolean exit = false;
			
			List<Task> tlist = new ArrayList<>();
			
			while(!exit)
			{
				System.out.println("Options : \n 1. Add New Task \n 2.Display all task \n 3.Delete a task \n 4.Update task status \n "
						+ "5.Display all pending tasks \n 6.Display all pending tasks for today \n 7.Display all tasks sorted by taskDate \n 8.Update status by task name \n 9.Exit");
				System.out.println("Enter the choice");
				try {
					switch (sc.nextInt()) {
					
					case 1:
						System.out.println("Enter task details :taskname,description,taskdate");
							Task task = TaskValidations.validateInputs( sc.next(), sc.next(), sc.next());
							task.setStatus(Status.PENDING);
							task.setActive(true);
							tlist.add(task);
							System.out.println("Added task successfully...");
							break;
						
					case 2:
						System.out.println("Display all details");
						for(Task a:tlist)
							System.out.println(a);
						break;
						
					case 3:
						System.out.println("Enter the id");
						String task1 =  TaskUtils.DeleteTask(sc.nextInt(), tlist);
						System.out.println("Task deleted successfully!!!!");
						break;
						
					case 4:
						System.out.println("Enter the id");
						Task task2 = TaskUtils.updateTask((sc.nextInt()), tlist);
						System.out.println("Enter the status");
						task2.setStatus(Status.valueOf(sc.next().toUpperCase()));
						System.out.println("Update task successfully");
						break;
						
					case 5:
						System.out.println("Display all tasks whose status is pending");
						for(Task a:tlist)
							if(a.getStatus()==Status.PENDING)
							System.out.println(a);
						break;
						
						
					case 6:
						System.out.println("Display all tasks of today");
						for(Task a:tlist)
							if((a.getStatus()==Status.PENDING && a.getTaskDate().equals(LocalDate.now()))==true)
							System.out.println(a);
						break;
						
						
					case 7:
						System.out.println("Task sorted by date");
						Collections.sort(tlist,new OrderByTaskDate());
						break;
						
					case 8:
						System.out.println("Enter the task name");
						Task task3 = TaskUtils.updateTaskByName((sc.next()), tlist);
						System.out.println("Enter the new status");
						task3.setStatus(Status.valueOf(sc.next().toUpperCase()));
						System.out.println("Update task successfully");
						break;
						
						
					case 9:
						exit = true;
						break;
						

	}

}catch (Exception e){
	sc.nextLine();
	System.out.println(e);
				}
			}
		
		}
		
	}
	
}
