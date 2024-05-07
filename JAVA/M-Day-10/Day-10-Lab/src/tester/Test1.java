package tester;

import static utils.StudentCollectionUtils.*;

import java.util.List;
import java.util.Map;

import com.app.core.Student;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("students from the list");
		// get populated list from utils
		List<Student> list = populateList();
		// 1.1 Display all student details from a student list
		list.forEach(s -> System.out.println(s));
		System.out.println("Student details from the map");
		// get student map
		Map<String, Student> map = populateMap(list);
		// 1.2 Display all student details(student roll no n gpa)
		// from a student map
		map.forEach((k, v) -> 
		System.out.println("Roll No " + v.getRollNo() 
		+ " GPA " + v.getGpa()));

	}

}
