//package tester;
//
//import com.app.core.Student;
//
//import java.util.Map;
//import java.util.Scanner;
//
//import static utils.IOUtils.readDetails;
//
//public class ReStoreStudentDetails {
//
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            System.out.println("Enter file name , to restore student details");
//            // invoke IOUtils method to write the details in a text file.
//            Map<String, Student> map = readDetails(sc.nextLine());
//            System.out.println("Student details -");
//            map.forEach((k, v) -> System.out.println(v));
//        } // sc.close()
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("main over...");
//
//    }
//
//}
