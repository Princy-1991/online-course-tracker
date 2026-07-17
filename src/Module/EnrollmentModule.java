package Module;

import java.util.Arrays;
import java.util.HashSet;

public class EnrollmentModule {
	public static void main(String[] args) {

		HashSet<Integer> StudentsID = new HashSet<>((Arrays.asList(101, 102, 103, 105, 102, 104)));
		HashSet<String> StudentsName = new HashSet<>(
				(Arrays.asList("Princy", "Harley", "Noah", "George", "Lydia", "Harley")));

		HashSet<String> enrollments = new HashSet<>((Arrays.asList("101-java", "102-Phython", "101-java,", "103-c++")));
		System.out.println("Students Ids:" + StudentsID);
		System.out.println("Students Name:" + StudentsName);
		System.out.println("Enrollments:" + enrollments);

	}
}

