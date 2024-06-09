package com.app.ordering;

import java.util.Comparator;

import com.app.entity.Task;

public class OrderByTaskDate implements Comparator<Task> {

	@Override
	public int compare(Task o1, Task o2) {
		
		int Val = o1.getTaskDate().compareTo(o2.getTaskDate());
		return Val;
	}

}
