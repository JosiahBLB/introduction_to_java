package exercises;

public class BankAccount {
	private String name;
	private String pin;
	private int balance;
	private int transactions;
	
	public BankAccount(String name){
		this.pin = "0000";
		this.transactions = 1;
		this.name = name;
	}
	
	public void deposit(int amount) {
		if(amount > 0) {
			balance += amount;
		}
		this.transactions += 1;
	}
	
	public void withdraw(String input, int amount) {
		if(amount > 0 && input == this.pin) {
			balance -= amount;
			this.transactions += 1;
		}
	}
	
	@Override
	public String toString() {
		return this.name+" has $"+this.balance+" (transaction no. "+this.transactions+")";
	}
	
	public static void main(String[] args) {
		BankAccount bc = new BankAccount("Josiah");
		bc.deposit(50);
		bc.withdraw("0000", 25);
		
		System.out.println(bc);
	}
}
