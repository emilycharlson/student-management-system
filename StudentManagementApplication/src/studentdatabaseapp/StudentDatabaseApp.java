package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		System.out.print("Enter number of students to enroll: ");
		Scanner scanner = new Scanner(System.in);
		int numOfStudents = scanner.nextInt();
		Student[] students = new Student[numOfStudents];
		
		for(int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].toString());
		}
	
		for(int i = 0; i < numOfStudents; i++) {
			System.out.println(students[i].toString());
			System.out.println();
		}
	}

}
