package Mainclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Module.CourseModule;
import Module.StudentModule;

public class mainsdetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Id:");
		int id = sc.nextInt();
		System.out.println("Enter your name");
		String name = sc.next();
		StudentModule obj = new StudentModule();
		CourseModule obj1 = new CourseModule();
		List<StudentModule> students = new ArrayList();
		students.add(obj);
		students.add(obj);
		students.add(obj);
		students.add(obj);
		students.add(obj);
		List<CourseModule> Course = new ArrayList();
		Course.add(obj1);
		Course.add(obj1);
		Course.add(obj1);
		Course.add(obj1);
		Course.add(obj1);
		
		for(StudentModule n:students){
			System.out.println(n.studentname);
			System.out.println("one student details");
			System.out.println(n.email);
			System.out.println(n.Mobilenumber);
			System.out.println(n.getStudentid());
			
			
			for(CourseModule m:Course) {
				System.out.println(m.courseduration);
				System.out.println(m.coursename);
				System.out.println(m.totalLessons);
				System.out.println(m.trainername);
				
			}
			
		}

	}

}
