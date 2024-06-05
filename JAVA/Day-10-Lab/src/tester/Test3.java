package tester;

import static utils.StudentCollectionUtils.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.app.core.Student;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("students from the list");
		// get populated list from utils
		List<Student> list = populateList();
		/*
		 * 1.3 Display all student details(from the list) sorted as per GPA (desc order)
		 * Use custom ordering
		 * 
		 */
		//rewrite below statement using function literal(=assigning func def to a variable)
		Comparator<Student> studentComp=(s1, s2) -> {
			System.out.println("in lambda");
			if (s1.getGpa() < s2.getGpa())
				return 1;
			if (s1.getGpa() > s2.getGpa())
				return -1;
			return 0;
		};
		Collections.sort(list,studentComp);
		//display sorted list
		System.out.println("sorted list");
		list.forEach(s -> System.out.println(s));

	}

}
