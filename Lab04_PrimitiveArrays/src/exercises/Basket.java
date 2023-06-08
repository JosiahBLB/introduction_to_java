package exercises;

public class Basket {
	private Purchase[] purchases;
	private int nPurchases;
	
	/**
	 * Initializes a new Basket object with an array of n purchases.
	 * @param n - basket capacity
	 */
	public Basket(int n) {
		this.purchases = new Purchase[n];
	}
	
	/**
	 * Adds a purchase to the basket if there is room.
	 * @param p - purchase to be added
	 */
	public void addPurchase(Purchase p) {
		for (int i = 0; i < this.purchases.length; i++) {
			if (this.purchases[i] == null) {
				this.purchases[i] = p;
				this.nPurchases++;
				return;
			}
		}
	}
	
	/**
	 * Returns the number of purchases currently in the basket.
	 * @return int n - number of purchases
	 */
	public int getNPurchases() {
		return this.nPurchases;
	}
	
	/**
	 * Returns the most expensive purchase object within the basket array.
	 * @return Purchase - the most expensive purchase
	 */
	public Purchase getMostExpensive() {
		Purchase mostExpensive = this.purchases[0];
		for (int i = 0; i < this.getNPurchases(); i++) {
			mostExpensive = (this.purchases[i].getPrice() > mostExpensive.getPrice()) ? this.purchases[i]
					: mostExpensive;
		}
		return mostExpensive;
	}
	
	/**
	 * Returns a new array of purchase objects within the purchases array, not including null values.
	 * @return Purchase[] - an array of purchases
	 */
	public Purchase[] getPurchases() {
		Purchase[] output = new Purchase[this.nPurchases];
		for (int i = 0; i < output.length; i++) {
			output[i] = this.purchases[i];
		}
		return output;
	}
	
	/**
	 * Returns the total price of all the purchases in the basket.
	 * @return double total - the total price
	 */
	public double total() {
		double total = 0.0;
		for (int i = 0; i < this.purchases.length; i++) {
			total += (purchases[i] == null) ? 0 : purchases[i].getPrice();
		}
		return total;
	}

	/**
	 * Prints all of the information of the purchase items and the total price to the console.
	 */
	public void printReceipt() {
		Purchase[] purchasesReceipt = this.getPurchases();
		for (int i = 0; i < purchasesReceipt.length; i++) {
			System.out.println(i + 1 + ". " + purchasesReceipt[i].getItemName() 
					+ " $" + purchasesReceipt[i].getPrice());
		}
		System.out.println("Total: " + String.format("%.2f", this.total()));
	}

}
