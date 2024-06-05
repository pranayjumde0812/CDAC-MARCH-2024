package tester;

import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;
import static io.IOInterface.*;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import com.app.core.Student;

public class Test_IO {
	//
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			Map<String, Student> studentmap = populateMap(populateList());

			Comparator<Student> comp = (s1, s2) -> s1.getName().compareTo(s2.getName());
			Stream<Student> list1 = studentmap.values().stream().sorted(comp);

//			Stream<Student> list = studentmap.values().stream().sorted(Comparator.comparing(Student::getName));
			System.out.println("Enter File name : ");
			addSortedStudent(list1, sc.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
