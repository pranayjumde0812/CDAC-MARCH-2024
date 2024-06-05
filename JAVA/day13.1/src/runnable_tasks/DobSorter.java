package runnable_tasks;

import java.util.List;

import com.app.core.Student;
import static java.lang.Thread.*;
import static utils.IOUtils.storeStudentDetails;
import static utils.StudentCollectionUtils.sortStudentsByDob;

public class DobSorter implements Runnable {
	private String fileName;
	private List<Student> studentList;

	public DobSorter(String fileName, List<Student> studentList) {
		super();
		this.fileName = fileName;
		this.studentList = studentList;
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " strted");
		try {

			storeStudentDetails(sortStudentsByDob(studentList), fileName);

		} catch (Exception e) {
			System.out.println("err in thrd " + currentThread().getName() + " " + e);
		}
		System.out.println(currentThread().getName() + " over");

	}

}
