package exercises;

import java.util.Scanner;

public class Student {
	// Declare instance variables
	String firstname;
	String lastname;
	String studentID;
	
	// Constructor for three inputs
	Student(String firstName, String lastName, String studentID) {
		this.firstname = firstName;
		this.lastname = lastName;
		this.studentID = studentID;
	}
	
	// Constructor for two inputs, SID has a default value
	Student(String firstName, String lastName){
		this.firstname = firstName;
		this.lastname = lastName;
		this.studentID = "?";
	}
	
	// Constructor for no inputs, all have initialized default values
	Student(){
		this.firstname = "UNKNOWN";
		this.lastname = "UNKNOWN";
		this.studentID = "?";
	}
	
	// Main program
	public static void main(String[] args) {
		// Make connection with keyboard with Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Get user input for the three parameters
		System.out.println("Please enter student's first name:");
		String fn = keyboard.nextLine();
		
		System.out.println("Please enter student's last name:");
		String ln = keyboard.nextLine();
		
		System.out.println("Please enter student's ID");
		String sid = keyboard.nextLine();
		
		// Create three Student object instances, some using default values
		Student first_example = new Student(fn, ln, sid);
		Student second_example = new Student(fn, ln);
		Student third_example = new Student();
		
		// Print out their values
		System.out.println("Calling 3 parameter constructor:\n"
				+ "Student's first name: "+first_example.firstname+" last name: "+first_example.lastname+" ID: "+first_example.studentID	);
		
		System.out.println("Calling 2 parameter constructor:\n"
				+ "Student's first name: "+second_example.firstname+" last name: "+second_example.lastname+" ID: "+second_example.studentID	);
		
		System.out.println("Calling zero parameter constructor:\n"
				+ "Student's first name: "+third_example.firstname+" last name: "+third_example.lastname+" ID: "+third_example.studentID	);
		
		// Close connection with keyboard
		keyboard.close();
	}

}
