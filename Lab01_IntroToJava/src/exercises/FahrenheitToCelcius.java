package exercises;

import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// Creating a new Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Printing instructions to console and taking user input
		System.out.println("Please enter the temperature in Fahrenheit:");
		int fahrenheit = keyboard.nextInt();
		
		// Converting to Celsius
		int celsius = (fahrenheit - 32) * 5/9;
		
		// Printing the answer to console
		System.out.println("The temperature "+fahrenheit+"F is "+celsius+"C");
		
		// Closing connection with keyboard
		keyboard.close();
	}

}
