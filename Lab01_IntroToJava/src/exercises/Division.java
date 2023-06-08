package exercises;

import java.util.Scanner;

public class Division {
	
	public static void main(String[] args) 
	{
		// Creating a new keyboard object
		Scanner keyboard = new Scanner(System.in);
		
		// Taking user input for numerator
		System.out.println("Please enter a numerator");
		int numerator = keyboard.nextInt();
		
		// Taking user input for denominator
		System.out.println("Please enter a denominator");
		int denominator = keyboard.nextInt();
		
		if (denominator == 0)
			System.out.println("The quantity is undefined");
		else
		{
			// Computing division
			float solution = (float) numerator/ denominator;
			
			// Printing to console
			System.out.println("The input fraction is: "+numerator+"/"+denominator+
					"\nThe decimal equivalence is: "+solution);
		}
		
		// Disconnecting communications with keyboard
		keyboard.close();
	}

}
