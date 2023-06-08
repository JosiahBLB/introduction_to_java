package exercises;

import java.util.Scanner;

public class Book {
	// Declaring instance variables
	String title;
	String author;
	int numberOfPages;

	// Main program
	public static void main(String[] args) {
		// Making connection with keyboard with scanner object
		Scanner keyboard = new Scanner(System.in);

		// Create new book instance
		Book my_book = new Book();

		// Take user input
		System.out.println("Please enter the title of the book");
		my_book.title = keyboard.nextLine();

		System.out.println("Please enter the author name");
		my_book.author = keyboard.nextLine();

		// Make sure the user specifies a number of pages greater than zero
		while (my_book.numberOfPages < 1) {
			System.out.println("Please enter the number of pages");
			my_book.numberOfPages = keyboard.nextInt();
		}

		// Print out the user input
		System.out.println("The book title is: " + my_book.title + "\nThe book author is: " + my_book.author
				+ "\nThe book has " + my_book.numberOfPages + " pages");

		// Close connection with the keyboard
		keyboard.close();
	}

}
