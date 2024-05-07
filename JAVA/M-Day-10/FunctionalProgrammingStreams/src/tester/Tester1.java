package tester;

import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.app.core.Student;

public class Tester1 {

	public static void main(String[] args) {
		System.out.println("Student from list");
//		get populated data
		List<Student> list = populateList();

//1.1   display all students list from student list
		list.forEach(student -> System.out.println(student));
		System.out.println("----------------------------------------------------------------------------");

//		get student from map
//1.2 	Display all students from student map student rollNum and GPA
		Map<String, Student> studentMap = populateMap(list);
		studentMap.forEach((k, v) -> System.out.println("Roll No. = " + v.getRollNo() + "," + " GPA = " + v.getGpa()));
		System.out.println("----------------------------------------------------------------------------");
		studentMap = new TreeMap<>(studentMap);
		studentMap.forEach((k, v) -> System.out.println("Roll No. = " + v.getRollNo() + "," + " GPA = " + v.getGpa()));
		System.out.println("----------------------------------------------------------------------------");

//1.3	Display all students details (from the list) sorted as per gpa(Desc Order) Custom Ordering
		Collections.sort(list, (s1, s2) -> {
			System.out.println("In Lambda");
			if (s1.getGpa() < s2.getGpa())
				return 1;
			if (s1.getGpa() > s2.getGpa())
				return -1;
			return 0;
		});
//		display sorted list
		list.forEach(student -> System.out.println(student));
		System.out.println("----------------------------------------------------------------------------");

//		1.4 Remove all failed students from the map n display the map again
//		(gpa < 6 => failure)
		Collection<Student> list1 = studentMap.values();
		list1.removeIf(student -> student.getGpa() < 6);
		list1.forEach(l -> System.out.println(l));
		System.out.println("----------------------------------------------------------------------------");
		studentMap.forEach((k, v) -> System.out.println(v));
	}

}
