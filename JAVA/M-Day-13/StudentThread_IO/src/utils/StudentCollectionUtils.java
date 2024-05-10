package utils;

import static com.app.core.Subject.DBT;
import static com.app.core.Subject.JAVA;
import static com.app.core.Subject.ML;
import static com.app.core.Subject.R;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.app.core.Address;
import com.app.core.Student;

public class StudentCollectionUtils {

	public static List<Student> populateList() {
		List<Student> students = Arrays.asList(new Student("dac-001", "ravi", parse("1990-12-13"), DBT, 7),
				new Student("dac-009", "riya", parse("1992-12-13"), ML, 6.9),
				new Student("dac-004", "shekhar", parse("1991-12-13"), DBT, 8.9),
				new Student("dac-002", "priya", parse("1990-02-23"), JAVA, 4),
				new Student("dac-007", "kiran", parse("1993-02-13"), R, 8.9),
				new Student("dac-003", "meeta", parse("1993-12-13"), R, 5.9),
				new Student("dac-008", "sameer", parse("1991-12-06"), DBT, 5));
		List<Address> adrs = Arrays.asList(new Address("pune", "MH", "452446"), new Address("pune", "MH", "652446"),
				new Address("nagpur", "MH", "852446"), new Address("indore", "MP", "752446"),
				new Address("mumbai", "MH", "672446"), new Address("pune", "MH", "692446"),
				new Address("chennai", "TN", "862446"));
		int index = 0;
		for (Student s : students)
			s.assignAddress(adrs.get(index++));
		return students;// fixed size student list , where students  are linked with address.
	}
	//sort the list data as per gpa
	public static List<Student> sortStudentsByGPA(List<Student> list)
	{
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return ((Double)o1.getGpa()).compareTo(o2.getGpa());
			}
			
		});
		return list;
	}
	//sort the list data as per dob
		public static List<Student> sortStudentsByDob(List<Student> list)
		{
			Collections.sort(list, new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					// TODO Auto-generated method stub
					return o1.getDob().compareTo(o2.getDob());
				}
				
			});
			return list;
		}
		//sort the list data as per subject
		public static List<Student> sortStudentsBySubject(List<Student> list)
		{
			Collections.sort(list, new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					// TODO Auto-generated method stub
					return o1.getSubject().compareTo(o2.getSubject());
				}
				
			});
			return list;
		}

}
