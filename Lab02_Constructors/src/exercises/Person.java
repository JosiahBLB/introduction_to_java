package exercises;

import java.util.Scanner;

public class Person {
	// Declare instance variables
	int age;
	double weight;
	boolean student;
	char gender;

	// Constructor that takes four parameters
	Person(int age, double weight, boolean student, char gender) {
		this.age = age;
		this.weight = weight;
		this.student = student;
		this.gender = gender;
	}

	// Default constructor
	Person() {
		this.age = -1;
		this.weight = -1;
		this.student = false;
		this.gender = '?';
	}

	/**
	 * Checks if the person is a student or not
	 * 
	 * @return boolean
	 */
	public boolean isStudent() {
		return this.student;
	}

	/**
	 * Checks the persons age
	 * 
	 * @return age
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * Checks to see if the person is eligible for a student discount
	 * 
	 * @return discount
	 */
	public int computeDiscountPercent() {
		if (this.student && this.age > 10 && this.age < 20)
			return 50;
		return 0;
	}

	// Main function
	public static void main(String[] args) {
		// Make connection with the keyboard
		Scanner keyboard = new Scanner(System.in);

		// Give user instructions and take in input
		System.out.println("Please enter the person's age: ");
		int age = keyboard.nextInt();

		System.out.println("Please enter the person's weight: ");
		double weight = keyboard.nextDouble();

		System.out.println("Is the person a student? (true/false):");
		boolean student = keyboard.nextBoolean();

		System.out.println("Please enter the person's gender (M/F): ");
		char gender = keyboard.next().charAt(0);

		// Create new person instance with the users input parameters
		Person person = new Person(age, weight, student, gender);

		// Print out the given information on the person
		System.out.println("Person: age: " + person.age + " weight: " + person.weight + " student: " + person.student
				+ " gender: " + person.gender + "\nStudent discount: " + person.computeDiscountPercent() + "%");

		// Close the connection with the keyboard
		keyboard.close();
	}

}
