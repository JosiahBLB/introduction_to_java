package exercises;

import java.util.Scanner;

public class ShopApp {
	/**
	 * Instructions were ambiguous, was told to make an instance variable but it was never used.
	 * Made the assumption that the instance variable was intended to be used and therefore
	 *  a constructor and getter was required.
	 */
	private OnlineShop onlineShop;
	
	public ShopApp() {
		this.onlineShop = new OnlineShop();
	}
	
	public OnlineShop getOnlineShop() {
		return this.onlineShop;
	}

	public static void main(String[] args) {
		// Make a connection with the keyboard
		Scanner keyboard = new Scanner(System.in);

		// Instantiate a shop and it's products
		ShopApp app = new ShopApp();
		Product computer = new Product("T-800", "Cyberdyne Systems", 10_000);
		Product notebook = new Product("Notebook", "Oxford", 3.40);
		Product cube = new Product("Magic Cube", "Toy Inc", 5.34);
		Product headphones = new Product("Headphones", "Sound Company", 99.99);
		Product thermos = new Product("Coffee Thermos", "Hot Cold Company", 30.99);

		// Add all products to the shop
		Product[] products = { computer, notebook, cube, headphones, thermos };
		for (int i = 0; i < products.length; i++) {
			app.getOnlineShop().addProduct(products[i]);
		}

		// Variables for the user interface
		boolean running = true;
		char userInput;
		int productNum;
		double rating;

		// User interface
		while (running) {
			productNum = 0; // Resets upon each loop
			rating = -1.0;
			
			System.out.println("Select an option (A, B or C):\n"
					+ "A. Display inventory\n" + "B. Rate Product\n" + "C. Exit");
			userInput = keyboard.next().charAt(0);

			if (userInput == 'A') {
				// Print inventory
				System.out.println("\n" + app.getOnlineShop());
			}

			if (userInput == 'B') {
				// Choose product
				System.out.println("\nSelect a product:\n" + app.getOnlineShop());
				while (productNum < 1 || productNum > app.getOnlineShop().getNumOfProducts()) {
					productNum = keyboard.nextInt();
					if (productNum < 1 || productNum > app.getOnlineShop().getNumOfProducts()) {
						System.out.println("Please enter a valid integer...");
					}
				}
				
				// Rate product
				Product product = app.getOnlineShop().getProduct(productNum);
				System.out.println(product + "\nRate this product from 0.0 to 5.0:");
				while (rating < 0.0 || rating > 5.0) {
					rating = keyboard.nextDouble();
					if (rating < 0.0 || rating > 5.0) {
						System.out.println("Please enter a valid number...");
					}
				}
				
				product.rateReliability(rating);
				System.out.println("\n" + product);
				
			}
			
			// Exit user interface
			running = (userInput == 'C') ? false : true;
		}

		// Close connection with keyboard
		keyboard.close();
	}

}
