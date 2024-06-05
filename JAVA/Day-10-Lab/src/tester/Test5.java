package tester;

import static utils.StudentCollectionUtils.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.app.core.Student;

public class Test5 {

	public static void main(String[] args) {
		Map<String, Student> map = populateMap(populateList());
		
		System.out.println("all students from map");
		map.forEach((k,v) -> System.out.println(v));
		/*
		 * 1.4 Remove all failed students from the map n display the map again (gpa < 6
		 * => failure)
		 */
		map.values() //Collection<Student>
		.removeIf(s -> s.getGpa()<6);
		
		System.out.println("students from map after removal");
		map.forEach((k,v) -> System.out.println(v));
	
		
	}

}
