package exercises;

import java.util.Scanner;

public class ConvertDistance {

	public static void main(String[] args) 
	{	
		// Save the conversion factor
		double conversion_factor = 1.60935;
		
		// Create new scanner object using keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// Print message and take user input
		System.out.println("Enter the number of miles:");
		float miles = keyboard.nextFloat();
		
		// Handle if user inputs anything lower than zero
		if(miles < 0)
			System.out.println("Please enter a value greater than 0!");
		else
		{
			// Convert from miles to kilometers and print the result
			double kilometers = conversion_factor * miles;
			System.out.println("The number of kms is: "+ kilometers);
		}
		
		// Disconnect communications with keyboard
		keyboard.close();
	}
}
