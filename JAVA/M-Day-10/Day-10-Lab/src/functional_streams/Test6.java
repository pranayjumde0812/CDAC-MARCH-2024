package functional_streams;

import java.lang.StackWalker.Option;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

import com.app.core.Student;
import com.app.core.Subject;

import static utils.StudentCollectionUtils.*;

public class Test6 {

	public static void main(String[] args) {
		// display sum of squares of the even nos between 1-100
		int result = IntStream.rangeClosed(1, 100)// IntStream 1-100
				.filter(i -> i % 2 == 0) // IntStream : evens
				.map(i -> i * i)// IntStream : square of evens
				.sum();// terminal op : reduce
		System.out.println("sum " + result);
		// display sum of gpas of all passed students , (map)
		Map<String, Student> map = populateMap(populateList());
		double sum = map.values().stream() // Stream<Student> : all
				.filter(s -> s.getGpa() > 6) // Stream<Student> : passed only
				.mapToDouble(s -> s.getGpa()) // DoubleStream
				.sum();
		System.out.println("sum of GPAs " + sum);
		// display the student details from list of students ,
		// sorted as per the dob using function literal
		// stream --> sorted --> forEach
		List<Student> list = populateList();
		System.out.println("Stduent details sorted as per dob");
		Comparator<Student> comp = (s1, s2) -> s1.getDob().compareTo(s2.getDob());
		list.stream().sorted(comp).forEach(s -> System.out.println(s));
		// print the name of subject topper
		// map --collection --stream --filter(subject) --max(Comparator)
		// --get
		Optional<Student> optional = map.values() // Collection<Student>
				.stream() // Stream<Student>
				.filter(s -> s.getSubject() == Subject.SE) // Stream<Student> : filtered
				.max((s1, s2) -> ((Double) s1.getGpa()).compareTo(s2.getGpa()));
		if (optional.isPresent())
			System.out.println("Topper " + optional.get());
		else
			System.out.println("no students !!!!");

	}

}
