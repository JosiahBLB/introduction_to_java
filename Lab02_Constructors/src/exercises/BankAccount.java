package exercises;

public class BankAccount {
	// Declaration of instance variables
	String firstname;
	String lastname;
	double balance;

	// Constructor for opening an account, balance starts at zero
	BankAccount(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.balance = 0.0;
	}

	/**
	 * Withdraws a specified amount of money from the bank account if the account
	 * has enough money in it and if the amount is not negative.
	 * 
	 * @param amount 	the size of the withdrawal in dollars
	 */
	public void withdraw(int amount) {
		if (this.balance > amount && amount > 0) {
			this.balance -= amount;
		}
	}

	/**
	 * Deposits a specified amount of money into the bank account, also checks that
	 * the amount is not zero.
	 * 
	 * @param amount 	the size of the deposit in dollars
	 */
	public void deposit(int amount) {
		if (amount > 0) {
			this.balance += amount;
		}
	}

	/**
	 * Adds the specified amount of money to the account with an additional fee of
	 * 10%.
	 * 
	 * @param amount 	the size of the loan in dollars
	 */
	public void borrow(int amount) {
		if (amount > 0) {
			this.balance -= (amount * 1.1);
		}
	}

}
