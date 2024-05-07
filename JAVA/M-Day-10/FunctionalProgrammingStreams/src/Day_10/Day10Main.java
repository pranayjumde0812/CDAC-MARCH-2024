package Day_10;

import com.app.core.Student;
import com.app.core.Subject;

import static utils.StudentCollectionUtils.*;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Day10Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //get populated map student, display all
        Map<String, Student> studentMap = populateMap(populateList());
        List<Student> students = populateList();
        students.forEach(i -> System.out.println(i));

        // display all element from map
        studentMap
                .forEach((k, v) -> System.out.println(v));
        System.out.println("======================================================================");


        System.out.println("======================================================================");
        // accept subject name from user
        System.out.println("Enter subject name");
        Subject subject = Subject.valueOf(sc.next().toUpperCase());

        // display students from specified subject
        studentMap
                .values()
                .stream()
                .filter(sub -> sub.getSubject() == subject)
                .forEach(i -> System.out.println(i));
        System.out.println("======================================================================");

        // Print student from specified address
        // accept city name from user
        System.out.println("Enter City name");
        String city = sc.next();
        studentMap
                .values()
                .stream()
                .filter(stud -> stud.getAddress().getCity().equals(city))
                .forEach(i -> System.out.println(i));
        System.out.println("======================================================================");

    }
}
