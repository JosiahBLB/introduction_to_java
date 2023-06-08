package exercises;

import java.util.Scanner;

public class CoinChangerApplication {

	public static void main(String[] args) {
		
		// Initialize connection with keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// Make a new coin changer object
		CoinChanger cc = new CoinChanger();
		
		// Initialize application running state
		boolean running = true;
		
		// Declare user input variable
		char input;
		
		// Main application
		while (running) {
			
			// Greet and take in user input
			System.out.println("Welcome to the Coin Changer Machine. Please input your coins:\n" 
					+ "Number of 10c coins:");
			cc.setTen(keyboard.nextInt());

			System.out.println("Number of 20c coins:");
			cc.setTwenty(keyboard.nextInt());

			System.out.println("Number of 50c coins:");
			cc.setFifty(keyboard.nextInt());

			System.out.println("Number of dollar coins:");
			cc.setOneDollar(keyboard.nextInt());

			System.out.println("Number of two dollar coins:");
			cc.setTwoDollar(keyboard.nextInt());
			
			// Output value in dollars
			System.out.println("The total value of the coin collection is: $" + cc.dollars() + "." + cc.cents());
			System.out.println("Would you like to continue? (Y?)");
			
			// Take user input if they want to continue
			input = keyboard.next().charAt(0);
			running = (input == 'Y') ? true : false;
		}
		
		// Close connection with keyboard
		keyboard.close();
	}
}
