package com.app.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.entity.Employee;
import com.app.ordering.SortByDoj;
import com.app.utils.EmpValidations;
import com.app.utils.EmployeeUtils;

public class EmpTester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			boolean exit = false;
			List<Employee> list = new ArrayList<>();
			
			while(!exit)
			{
				System.out.println("Option \n 1.Add full time employee \n 2.Add part time employee \n 3.Delete an employee by Emp Id \n "
						+ "4.Search employee details by Aadhaar number \n 5.Display all employee details \n "
						+ "6.Display all employee details sorted by date of joining\n"
						+ " 7.Exit");
				System.out.println("Enter the choice");
				try {
					switch(sc.nextInt())
					{
					case 1:
						System.out.println("Enter the details of FTE: Name, doj, phoneno, aadhaarno, hoursal");
						Employee emp = EmpValidations.addFTE(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),list);
						list.add(emp);
						System.out.println("FTE added successfully... ");
						
						break;
						
					case 2:
						System.out.println("Enter the details of PTE: Name, doj, phoneno, aadhaarno, monthsal");
						Employee emp1 = EmpValidations.addPTE(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),list);
						list.add(emp1);
						System.out.println("PTE added successfully... ");
						
						break;
						
					case 3:
						System.out.println("Enter the id which u want to remove");
						EmployeeUtils.deleteEmp(sc.nextInt(), list);
						System.out.println("Deleted successfully");
						break;
						
					case 4:
						System.out.println("Enter the aadhaarno which u want to search");
						Employee e = EmployeeUtils.searchByAadhar(sc.next(), list);
						System.out.println(e);
						break;
						
					case 5:
						System.out.println("Display all employee");
						for(Employee e1 : list)
							System.out.println(e1);
						break;
						
					case 6:
						System.out.println("Sorting by DOJ");
						Collections.sort(list,new SortByDoj());
						break;
						
					case 7:
						exit = true;
						break;
						
					
					}
				}catch(Exception e)
				{
					sc.nextLine();
					System.out.println(e);
				}
			}
		}

	}

}
