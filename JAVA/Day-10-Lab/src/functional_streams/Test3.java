package functional_streams;
import static utils.StudentCollectionUtils.populateList;

import java.util.List;

import com.app.core.Student;
import com.app.core.Subject;

public class Test3 {

	public static void main(String[] args) {
		List<Student> list = populateList();
		// display complete student list
		System.out.println("All students");
		list.forEach(s -> System.out.println(s));
		//accept subject from user (scanner)
		Subject sub=Subject.JAVA;
		System.out.println("Filtered  students ");
		//display all student details from specified subject
		//src(list) --filter(intermediate op.) -- forEach (terminal op)
		list.stream() //Stream<Student> : all students
		.filter(s -> s.getSubject()==sub) // Stream<Student> : java students
		.forEach(s -> System.out.println(s));
		

	}

}
