package Day_10;

import com.app.core.Student;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.IntStream;

import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;

public class Day10_Tester2 {
    public static void main(String[] args) {
        // display sum of square of all even no between 1 to 100
        int result = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).map(i -> i * i).sum();
        System.out.println(result);

        // display sum of GPAs of all passed students (map)

        Map<String, Student> studentMap = populateMap(populateList());
        double sum = studentMap.values().stream().filter(s -> s.getGpa() > 6).mapToDouble(s -> s.getGpa()).sum();
        System.out.println(sum);

        //Display the student details from list of students
        // sorted as per the dob using function literal
//        Comparator<Student> comp = (s1, s2) -> s1.getDob().compareTo(s2.getDob());
        Comparator<Student> comp = Comparator.comparing(Student::getDob);

        studentMap.values().stream().sorted(comp).forEach(s -> System.out.println(s));

        System.out.println("================================================");

        // Find Topper student
        Student student = studentMap
                .values()
                .stream()
//                .filter(s -> s.getSubject() == Subject.ANGULAR) // subject wise topper
//                .max((s1, s2) -> ((Double) s1.getGpa()).compareTo(s2.getGpa())) // another way using comparator
                .max(Comparator.comparing(Student::getGpa))
                .get();
        System.out.println(student);
    }
}
