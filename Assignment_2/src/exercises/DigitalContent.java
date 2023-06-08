/*
 * 	A DigitalContent represents a type of digital media that other classes can 
 *  inherit from containing essential methods.
 *  
 *  by: Josiah Brough (22160417)
 */

package exercises;

abstract public class DigitalContent implements Comparable<DigitalContent> {
	protected String title;
	protected String publisher;
	protected String releaseDate;

	// Three input constructor
	public DigitalContent(String title, String publisher, String releaseDate) {
		this.title = title;
		this.publisher = publisher;
		this.releaseDate = releaseDate;
	}

	// Getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	// Overrides default to string
	@Override
	public String toString() {
		return this.title + "  published by  " + this.publisher + " (" + this.releaseDate + ")";
	}

	/**
	 * Checks if input query is in any of the instance variables
	 * 
	 * @param String query
	 * @return boolean
	 */
	public boolean match(String s) {
		return (this.publisher.toLowerCase().contains(s.toLowerCase())
				|| this.releaseDate.toLowerCase().contains(s.toLowerCase())
				|| this.title.toLowerCase().contains(s.toLowerCase()));
	}

	// Overrides default compareTo method to compare titles.
	@Override
	public int compareTo(DigitalContent o) {
		return this.title.compareTo(o.title);
	}
}
