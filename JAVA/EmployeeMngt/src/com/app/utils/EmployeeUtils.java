package com.app.utils;

import java.util.Iterator;
import java.util.List;

import com.app.entity.Employee;
import com.app.exception.EmployeeException;

public class EmployeeUtils {
	
	public static String deleteEmp(int id, List<Employee> list) throws EmployeeException {
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            if (e.getId() == id) {
                iterator.remove();
                return "Employee removed successfully";
            }
        }
        throw new EmployeeException("Invalid id...Can't delete...");
    }
	
	public static Employee searchByAadhar(String aadhaarno,List<Employee>list) throws EmployeeException
	{
		for(Employee e:list)
		{
			if(e.getAadhaarno().equals(aadhaarno))
				return e;
		}
		throw new EmployeeException("Invalid aadhaarno,,.Not found...");
		
	}
	 
	
	
}
