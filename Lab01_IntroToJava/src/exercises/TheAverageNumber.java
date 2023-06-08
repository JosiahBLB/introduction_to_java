package exercises;

import java.util.Scanner;

public class TheAverageNumber {

	public static void main(String[] args) {
		// Creating a new scanner object
		Scanner keyboard =  new Scanner(System.in);
		
		// Input for the first number
		System.out.println("Enter the first number");
		int first_number = keyboard.nextInt();
		
		// Input for the second number
		System.out.println("Enter the second number");
		int second_number = keyboard.nextInt();
		
		// Input for the third number
		System.out.println("Enter the third number");
		int third_number = keyboard.nextInt();
		
		// Calculate the average
		double average = (first_number+second_number+third_number)/3.0;
		
		// Print average to console
		System.out.println("The average of the numbers is: "+average);
		
		// Close connection with keyboard
		keyboard.close();
	}
}
