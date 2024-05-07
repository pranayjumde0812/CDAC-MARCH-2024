package functional_streams;
import static utils.StudentCollectionUtils.*;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;
public class Test5 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)){
		//get populated map of students , display all
		Map<String, Student> studentMap = 
				populateMap(populateList());
		//forEach 
		studentMap.forEach((k,v)-> System.out.println(v));		
		//accept subject name from client
		System.out.println("enter subject name");
		Subject chosenSubject=Subject.valueOf(sc.next().toUpperCase());
		//display passed (gpa > 5) student details from a specified subject
		studentMap.values() //Collection<Student>
		.stream() //Stream<Student> : all 
		.filter(s -> s.getSubject()==chosenSubject) //Stream<Student> : filtered
		.filter(s -> s.getGpa()> 6)
		.forEach(s -> System.out.println(s));
		}
		

	}

}
