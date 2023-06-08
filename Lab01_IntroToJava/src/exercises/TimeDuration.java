package exercises;

import java.util.Scanner;

public class TimeDuration {

	public static void main(String[] args) {
		// Making an new Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Take user input for hours
		System.out.println("Enter the number of hours");
		int hours = keyboard.nextInt();
		
		// Take user input for minutes
		System.out.println("Enter the number of minutes");
		int minutes = keyboard.nextInt();
		
		// Take user input for seconds
		System.out.println("Enter the number of seconds");
		int seconds = keyboard.nextInt();
		
		// Calculate total seconds
		int total_seconds = seconds + minutes*60 + hours*3600;
		
		// Print to console
		System.out.println(total_seconds);
		
		// Closing connection with keyboard
		keyboard.close();
	}
}
