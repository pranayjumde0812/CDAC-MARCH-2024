package com.app.ordering;

import java.util.Comparator;

import com.app.entity.Employee;

public class SortByDoj implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int val = o1.getDoj().compareTo(o2.getDoj());
		return val;
	}

}
