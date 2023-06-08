package exercises;

public class Purchase {
	private String itemName;
	private double price;
	
	// Constructor
	public Purchase(String itemName, double price) {
		this.itemName = itemName;
		this.price = price;
	}
	
	/**
	 * Returns the price of the purchase object.
	 * @return double price
	 */
	public double getPrice() {
		return this.price;
	}
	
	/**
	 * Returns the name of the purchase object.
	 * @return String name
	 */
	public String getItemName() {
		return this.itemName;
	}
	
	/**
	 * Overrides the default toString method, prints purchase information.
	 */
	public String toString() {
		return ("Item: " + this.itemName + " Price: $" + this.price);
	}
}
