package exercises;

import java.util.Scanner;

public class CashPoint {
	
	// Main program
	public static void main(String[] args) {
		// Make connection with keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// Print instructions and take user input
		System.out.println("Please enter your first name:");
		String fn = keyboard.nextLine();

		System.out.println("Please enter your last name:");
		String ln = keyboard.nextLine();
		
		// Make a new BankAccount instance
		BankAccount account = new BankAccount(fn, ln);
		
		// Declare variables for user interface
		int amount;
		// Initialize this one
		boolean running = true;
		
		// Start user interface
		while (running) {
			// Print welcome screen and account details
			System.out.println(
					"Welcome " + account.firstname + " " + account.lastname + "! Your balance is $" + account.balance);
			System.out.println("What would you like to do? (W)ithdraw, (D)eposit, (B)orrow or (Q)uit");
			
			// Take input for the desired action
			char input = keyboard.next().charAt(0);
			
			// Action for an account withdrawal
			if (input == 'W') {
				System.out.println("Enter the amount you would like to withdraw:");
				amount = keyboard.nextInt();
				account.withdraw(amount);
			}
			
			// Action for a account deposit
			if (input == 'D') {
				System.out.println("Enter the amount you would like to deposit:");
				amount = keyboard.nextInt();
				account.deposit(amount);
			}
			
			// Action for borrowing money including 10% interest on top
			if (input == 'B') {
				System.out.println("Enter the amount you would like to borrow:");
				amount = keyboard.nextInt();
				account.borrow(amount);
			}
			
			// Quit if finished with user interface
			if (input == 'Q') {
				System.out.println("Cya!");
				running = false;
			}
		}
		
		// Close connection with keyboard
		keyboard.close();
	}

}
