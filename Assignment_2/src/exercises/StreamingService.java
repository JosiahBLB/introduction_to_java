/*
 * 	A class that holds an array of digital contents with methods that handle 
 * 	said array.
 *  
 *  by: Josiah Brough (22160417)
 */

package exercises;

import java.util.ArrayList;
import java.util.Collections;

public class StreamingService {
	private ArrayList<DigitalContent> digitalContents;

	// Default constructor
	public StreamingService() {
		this.digitalContents = new ArrayList<DigitalContent>();
	}

	/**
	 * Adds a DigitalContent to the ArrayList instance variable.
	 * 
	 * @param digitContent
	 */
	public void add(DigitalContent digitContent) {
		if (digitContent != null) {
			this.digitalContents.add(digitContent);
		}
	}

	/**
	 * Check for a query match in any of the DigitalContents ArrayLists' instance
	 * variables.
	 * 
	 * @param query
	 * @return
	 */
	public ArrayList<DigitalContent> match(String query) {
		ArrayList<DigitalContent> out = new ArrayList<DigitalContent>();
		for (DigitalContent digitalContent : this.digitalContents) {
			if (digitalContent.match(query)) {
				out.add(digitalContent);
			}
		}
		return (out.size() == 0) ? null : out;
	}

	// Overrides default toString
	@Override
	public String toString() {
		ArrayList<String> out = new ArrayList<String>();
		for (DigitalContent digitalContent : this.digitalContents) {
			out.add(digitalContent.title);
		}
		Collections.sort(out);
		return out.toString();
	}
}
