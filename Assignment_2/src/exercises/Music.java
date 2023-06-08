/*
 * 	A Music class that includes methods and instance variables from the DigitalContent 
 *  class and includes an artist instance variable.
 *  
 *  by: Josiah Brough (22160417)
 */

package exercises;

public class Music extends DigitalContent {
	private String artist;

	// Four input constructor
	public Music(String title, String publisher, String releaseDate, String artist) {
		super(title, publisher, releaseDate);
		this.artist = artist;
	}

	// Getters and Setters
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	/**
	 * Overrides DigitalContents match method to extend the functionality and check
	 * query against the artist instance variable.
	 */
	@Override
	public boolean match(String s) {
		return (super.match(s) || this.artist.toLowerCase().contains(s.toLowerCase()));
	}

	/**
	 * Overrides DigitalContents toString method and extends functionality to include
	 * the artist.
	 */
	@Override
	public String toString() {
		return super.toString()+" Artist: "+this.artist;
	}
}
