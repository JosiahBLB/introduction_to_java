package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputeProduct {
	private static Scanner scanner;

	// A method that handles input mismatches
	public static void product() throws InputMismatchException {
		int value1;
		int value2;
		
		// Displays instructions to the user and takes in integer inputs
		System.out.println("Welcome to the calculator.");
		System.out.println("Enter first number:");
		value1 = scanner.nextInt();
		System.out.println("Enter second number:");
		value2 = scanner.nextInt();
		
		// Computes the product
		System.out.println("Product is: " + (value1 * value2));
	}

	public static void main(String args[]) {
		scanner = new Scanner(System.in);
		
		// Main program loop
		boolean running = true;
		while(running){
			try {
				product();
				running = false;
			} catch (InputMismatchException e) { // Handles mismatch exceptions
				System.out.println("Error: Input mismatch");
				scanner.next(); // Clears input
			}
		}
	}
}