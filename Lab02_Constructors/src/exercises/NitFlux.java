package exercises;

public class NitFlux {
	// Declare instance variables
	String email;
	int subscription_len;
	int subscription_cost;

	// Constructor that can take three parameters
	NitFlux(String email, int subscription_len, int subscription_cost) {
		this.email = email;
		this.subscription_len = subscription_len;
		this.subscription_cost = subscription_cost;
	}

	// Default constructor
	NitFlux() {
		this.email = "UNKNOWN";
		this.subscription_len = 0;
		this.subscription_cost = 0;
	}

	/**
	 * Computes the total cost for the users subscription
	 * 
	 * @return total_cost
	 */
	public int computeCustomerPay() {
		return (this.subscription_cost * this.subscription_len);
	}

	// Main program
	public static void main(String[] args) {
		// Create three different NitFlux instances
		NitFlux first_sub = new NitFlux("josiahbrough@gmail.com", 99, 5);
		NitFlux second_sub = new NitFlux("qhs7289@autuni.ac.nz", 3, 30);
		NitFlux third_sub = new NitFlux("myawesomeemail@gmail.com", 10, 5);

		// Print out the objects calculated total subscription cost
		System.out.println("Customer one to pay: " + first_sub.computeCustomerPay());
		System.out.println("Customer two to pay: " + second_sub.computeCustomerPay());
		System.out.println("Customer three to pay: " + third_sub.computeCustomerPay());
	}

}
