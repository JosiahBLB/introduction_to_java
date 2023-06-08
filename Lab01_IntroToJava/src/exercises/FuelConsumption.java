package exercises;

import java.util.Scanner;

public class FuelConsumption {

	public static void main(String[] args) 
	{
		// Create new scanner object using keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// Print message and take user input
		System.out.println("Enter the number of miles:");
		float miles = keyboard.nextFloat();
		
		// Print message and take user input
		System.out.println("Enter the gallons of fuel used:");
		float gallons = keyboard.nextFloat();
		
		// Handle if user inputs anything lower than zero
		if(miles < 0 || gallons < 0)
			System.out.println("Please enter a value greater than 0!");
		else
		{
			// Convert from miles to kilometers and print the result
			double efficiency = miles / gallons;
			System.out.println("Miles Per Gallon: "+ efficiency);
		}
		
		// Disconnect communications with keyboard
		keyboard.close();
	}
}
