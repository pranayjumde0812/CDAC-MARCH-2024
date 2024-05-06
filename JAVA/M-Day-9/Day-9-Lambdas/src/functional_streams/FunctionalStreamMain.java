package functional_streams;

import java.util.List;

import com.app.core.Student;
import com.app.core.Subject;

import static utils.StudentCollectionUtils.*;

public class FunctionalStreamMain {

	public static void main(String[] args) {
		List<Student> list = populateList();

		System.out.println("print all studnts");
		list.stream().forEach(s -> System.out.println(s));

		System.out.println("Accept from user ");
		Subject sb = Subject.ANGULAR;

		list.stream().filter(s -> s.getSubject() == sb).forEach(s -> System.out.println(s));

	}
}
