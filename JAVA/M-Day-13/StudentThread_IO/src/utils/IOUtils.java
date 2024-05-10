package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.app.core.Student;

public class IOUtils {

	//write a method to store sorted  details in a text file using buffering
		public static void storeStudentDetails(List<Student> students,String fileName) throws IOException
		{
			//chain of auto closeable resources
			//JA ---> PW ----> FW --->File :only  buffering 
			//Triggers : for PW ---> sent to the device : buf full , flush , close , autoFlush(flush upon new line)
			try(PrintWriter pw=new PrintWriter(new FileWriter(fileName)))
			{
				pw.println("Student Info sorted as per criteria");
				//attach iterator (for each)
				for(Student s : students) {
					pw.println(s);
					pw.println();
				}
				System.out.println("info saved ...");
			}
		}
}
