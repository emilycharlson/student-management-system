package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int grade;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	private static int courseCost = 600; // true for the entire class
	private static int id = 1000;

	public Student() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter student first name: ");
		this.firstName = scanner.nextLine();

		System.out.print("Enter student last name: ");
		this.lastName = scanner.nextLine();

		System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student grade level: ");
		this.grade = scanner.nextInt();

		setStudentID();

		

	}

	private void setStudentID() {

		id++;
		this.studentID = grade + "" + id;
	}

	public void enroll() {

		do {

			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner scanner = new Scanner(System.in);
			String course = scanner.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n   " + course;
				tuitionBalance += courseCost;
			} else {
				System.out.println();
				break;
			}
		} while (1 != 0);

	}
	
	
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	
	public void payTuition() {
		viewBalance();
		System.out.println();
		System.out.print("Enter your payment: $");
		Scanner scanner = new Scanner(System.in);
		int payment = scanner.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of $" + payment);
		System.out.println();
		viewBalance();
		System.out.println();
	}
	
	public String toString() {
		return "Name: " + firstName + " " + lastName + 
				"\nGrade Level: " + grade +
				"\nStudentID: " + studentID +
				 "\nCourses Enrolled: " + courses +
				 "\nBalance: $" + tuitionBalance;
	}
	

}
