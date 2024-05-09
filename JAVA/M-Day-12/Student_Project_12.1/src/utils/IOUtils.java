package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import com.app.core.Student;

public interface IOUtils {
//add a static method for storing student details
	static void writeDetails(Stream<Student> students, 
			String fileName) throws IOException{
		//Java App --> PW --> FW -- dest text file
		try(PrintWriter pw=new PrintWriter(new FileWriter(fileName))) {
			students.forEach(s -> pw.println(s));
		}// JVM : pw.close --pw.flush(data will sent to FW)  --fw.close
	}
}
