package com.app.utils;

import java.util.List;

import com.app.entity.Task;
import com.app.exception.TaskException;

public class TaskUtils {

	public static String DeleteTask(int id, List<Task> list) throws TaskException {
		Task t = new Task(id);
		int index = list.indexOf(t);
		if (index == -1)
			throw new TaskException("Id invalid!!!!");
		return list.remove(index).getTaskname();

	}

	public static Task updateTask(int id, List<Task> list) throws TaskException {
        for (Task task : list) {
            if (task.getId() == id) {
                return task;
            }
        }
        throw new TaskException("Id invalid!!!!");
    }
	
	public static Task updateTaskByName(String taskname, List<Task> list) throws TaskException {
        for (Task task : list) {
            if (task.getTaskname().equalsIgnoreCase(taskname)) {
                return task;
            }
        }
        throw new TaskException("Task name invalid!!!!");
    }
}
