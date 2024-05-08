package tester;

import com.app.core.Student;

import java.util.Map;
import java.util.Scanner;

import static utils.IOUtils.writeDetails;
import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;

public class StoreStudentDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get the populated map from coll utils
			Map<String, Student> map = populateMap(populateList());
			System.out.println("Enter file name , to store student details");
			// invoke IOUtils method to write the details in a text file.
			writeDetails(map, sc.nextLine());
			System.out.println("data stored ....");
		} // sc.close()
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
