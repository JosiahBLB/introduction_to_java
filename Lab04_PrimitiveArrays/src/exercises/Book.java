package exercises;

public class Book {
	private String title;
	private String author;
	private boolean borrowed;
	
	// Two input constructor
	Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.borrowed = false;
	}
	
	// Gets book title
	public String getTitle() {
		return this.title;
	}
	
	// Sets borrow status
	public void setBorrowStatus(boolean status) {
		this.borrowed = status;
	}
	
	// Overrides the default toString
	public String toString() {
		String status = (this.borrowed)? "Yes" : "No";
		return(this.title + " By " + this.author + " is borrowed: " + status);
	}
}
