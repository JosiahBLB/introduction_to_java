package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputeProductMenu {
	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Welcome to the calculator.");
		
		// Main program loop
		boolean running = true;
		while(running) {
			
			// First input
			boolean notValid = true;
			System.out.println("1. Compute product\n" + "2. quit");
			int input = 0;
			while(notValid) {
				try {
					input = scanner.nextInt();
					if (input != 1 && input != 2) {
						System.out.println("Invalid menu input. Please try again.");
					} else {
						notValid = false;
					}
				} catch (InputMismatchException e) { // Handles the input mismatch error
					System.out.println("Invalid menu input. Please try again.");
					scanner.next(); // Clears the input buffer
				}
			}
			
			// Option 1: Compute product
			if(input == 1) {
				int value1 = 0;
				int value2 = 0;
				
				// Takes in the first integer
				System.out.println("Enter first number:");
				notValid = true;
				while(notValid) {
					try {
						value1 = scanner.nextInt();
						notValid = false;
					} catch (InputMismatchException e) { // Handles the input mismatch error
						System.out.println("Error reading integer value");
						scanner.next(); // Clears the input buffer
					}
				}
				
				// Takes in the second integer
				System.out.println("Enter Second number:");
				notValid = true;
				while(notValid) {
					try {
						value2 = scanner.nextInt();
						notValid = false;
					} catch (InputMismatchException e) { // Handles the input mismatch error
						System.out.println("Error reading integer value");
						scanner.next(); // Clears the input buffer
					}
				}
				
				// Prints the product
				System.out.println("Product is: "+value1*value2);
			} else {
				running = false;
			}
		}
		System.out.println("Goodbye!");
		
		
	}
}
