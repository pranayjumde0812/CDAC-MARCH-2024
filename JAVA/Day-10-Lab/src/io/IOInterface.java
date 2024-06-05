package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import com.app.core.Student;

public interface IOInterface {

	static void addSortedStudent(Stream<Student> sortedStudentList, String fileName) throws IOException {

		try (PrintWriter pw = new PrintWriter(new FileWriter(fileName, true))) {

			sortedStudentList.forEach(line -> pw.println(line));

		}

	}
}
