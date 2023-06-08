/*
 * 	A Film class that includes methods and instance variables from the DigitalContent 
 *  class and includes a cast instance variable.
 *  
 *  by: Josiah Brough (22160417)
 */

package exercises;

public class Film extends DigitalContent {
	private String cast;

	// Four parameter constructor
	public Film(String title, String publisher, String releaseDate, String cast) {
		super(title, publisher, releaseDate);
		this.cast = cast;
	}

	// Getters and setters
	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	/**
	 * Overrides DigitalContents match method to extend the functionality and check
	 * query against the cast instance variable.
	 */
	@Override
	public boolean match(String s) {
		return (super.match(s) || this.cast.toLowerCase().contains(s.toLowerCase()));
	}

	/**
	 * Overrides DigitalContents toString method and extends functionality to include
	 * the cast.
	 */
	@Override
	public String toString() {
		return super.toString() + " Cast: " + this.cast;
	}
}
