package com.app.utils;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.app.entity.Employee;
import com.app.entity.FullTimeEmp;
import com.app.entity.PartTimeEmp;
import com.app.exception.EmployeeException;

public class EmpValidations {
	
	public static LocalDate parsedoj(String doj)
	{
		return LocalDate.parse(doj);
	}
	
	
	public static void setPhoneNumber(String phoneno) throws EmployeeException 
	{
		String regexp = "(^[0-9]{10}$)";
		if(!phoneno.matches(regexp))
			throw new EmployeeException("Invalide phone number");
	}
	
	public static void setAadhaarNo(String aadhaarno) throws EmployeeException 
	{
		String regexp = "(^[0-9]{12}$)";
		if(!aadhaarno.matches(regexp))
			throw new EmployeeException("Invalide Aadhaar number");
	}
	
	public static void chkDupAadhaarNo(String aadhaarno,List<Employee>list) throws EmployeeException 
	{
		//Employee e = new Employee(aadhaarno);
		if(list.contains(aadhaarno))
			throw new EmployeeException("Duplicate Aadhaar number");
	}
	
	
	
//	public static Employee validateInputes(String name, String doj, String phoneno, String aadhaarno) throws EmployeeException
//	{
//		
//		LocalDate d = parsedoj(doj);
//		setPhoneNumber(phoneno);
//		setAadhaarNo(aadhaarno);
//		return new Employee(name,d,phoneno,aadhaarno);
//		
//	}
	
	public static FullTimeEmp addFTE(String name, String doj, String phoneno, String aadhaarno,double hoursal,List<Employee>list) throws EmployeeException
	{
		LocalDate d = parsedoj(doj);
		setPhoneNumber(phoneno);
		setAadhaarNo(aadhaarno);
		chkDupAadhaarNo(aadhaarno,list);
		return new FullTimeEmp(name,d,phoneno,aadhaarno,hoursal);
		
	}
	
	public static PartTimeEmp addPTE(String name, String doj, String phoneno, String aadhaarno,double monthsal,List<Employee>list) throws EmployeeException
	{
		LocalDate d = parsedoj(doj);
		setPhoneNumber(phoneno);
		setAadhaarNo(aadhaarno);
		chkDupAadhaarNo(aadhaarno,list);
		return new PartTimeEmp(name,d,phoneno,aadhaarno,monthsal);
		
	}
}
