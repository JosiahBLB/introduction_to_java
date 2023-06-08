package exercises;

import java.util.Scanner;

public class TimeConvert {
	
	public static void main(String[] args) {
	// Making new Scanner object 
	Scanner keyboard = new Scanner(System.in);
	
	// Print instructions and take user input
	System.out.println("Enter the number of seconds:");
	int input = keyboard.nextInt();
	int seconds = input;
	
	// Calculate minutes
	int minutes = seconds / 60;
	seconds %= 60;
	
	// Calculate hours
	int hours = minutes / 60;
	minutes %= 60;
	
	// Print output to console
	System.out.println(input + " seconds is equivalent to\n" +
						hours + " hours\n" +
						minutes + " minutes\n" +
						seconds + " seconds\n");
	
	// Closing connection with keyboard
	keyboard.close();
	}
}
