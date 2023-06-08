package exercises;

public class Library {
	private Book[] books;

	// Constructor for the library object, initializes a book array of specified
	// length
	public Library(int capacity) {
		this.books = (capacity > 0) ? new Book[capacity] : new Book[1];
	}

	// Overrides default toString
	public String toString() {
		String output = "";
		for (int i = 0; i < this.books.length; i++) {
			output += this.books[i] + "\n";
		}
		return output;
	}

	/**
	 * Adds a book to the book array in the next available location and returns a
	 * boolean.
	 * 
	 * @param Book
	 * @return bool
	 */
	public boolean addBook(Book book) {
		for (int i = 0; i < this.books.length; i++) {
			if (this.books[i] == null) {
				this.books[i] = book;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Finds the book within the array and sets borrow status to true.
	 * @param String title
	 * @return Book
	 */
	public Book borrow(String title) {
		for (int i = 0; i < this.books.length; i++) {
			if (books[i].getTitle().equals(title)) {
				books[i].setBorrowStatus(true);
				return books[i];
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// Initialize new library object
		Library library = new Library(5);
		
		// Add books to library
		library.addBook(new Book("The Lord of the Rings", "J. R. R. Tolkien"));
		library.addBook(new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling"));
		library.addBook(new Book("1984", "George Orwell"));
		library.addBook(new Book("Where the Wild Things Are", "Maurice Sendak"));
		library.addBook(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams"));
		
		// Print library information
		System.out.println(library);
		
		// Borrow a book and print updated status
		Book aBook = library.borrow("1984");
		System.out.println("Book borrowed: " + aBook);
	}
}
