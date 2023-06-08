package exercises;

public class BasketApp {

	public static void main(String[] args) {
		// New basket calls with a 10 purchase limit
		Basket basket = new Basket(10);
		
		// Add 5 purchases to the basket
		basket.addPurchase(new Purchase("Hat", 5.0));
		basket.addPurchase(new Purchase("Cat", 6.0));
		basket.addPurchase(new Purchase("Bat", 7.0));
		basket.addPurchase(new Purchase("Mat", 8.0));
		basket.addPurchase(new Purchase("Rat", 9.0));
		
		// Show example of methods
		System.out.println("Number of purchases: " + basket.getNPurchases()
							+ "\nMost expensive purchase: " + basket.getMostExpensive());
		
		// The rest of the methods are tested in this one method
		basket.printReceipt();
	}

}
