package exercises;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// Creating new scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Printing a message to the screen
		System.out.println("What is the message?");
		
		// Saving the user input from the Scanner object
		String message = keyboard.nextLine();
		
		// Printing the message out to console
		System.out.println("The message is \""+message+"\".");
		
		// Closing connection with keyboard
		keyboard.close();
	}
}
