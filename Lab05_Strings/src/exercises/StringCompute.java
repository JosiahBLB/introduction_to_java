package exercises;

public class StringCompute {
	private String str;
	
	// Getters and setters
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	/**
	 * Counts the occurrences of a give character
	 * @param ch - the character to look for
	 * @return int - the number of occurrences
	 */
	public int countOccurances(char ch) {
		int count = 0;
		for (int i = 0; i < this.str.length(); i++) {
			if (this.str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Checks the str instance variable to see if it only contains numbers
	 * @return bool
	 */
	public boolean hasOnlyDigits() {
		for (int i = 0; i < this.str.length(); i++) {
			if (this.str.charAt(i) < '0' || this.str.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Removes all occurrences of the given character from the str instance variable
	 * @param ch - the character to remove
	 * @return str - the updated string
	 */
	public String removeChar(char ch) {
		String updatedStr = "";
		for (int i = 0; i < this.str.length(); i++) {
			updatedStr += (this.str.charAt(i) == ch) ? "" : this.str.charAt(i);
		}
		this.str = updatedStr;
		return this.str;
	}
	
	/**
	 * Checks if the instance variable str is a palindrome
	 * @return bool
	 */
	public boolean isPalindrome() {
		String reversedStr = "";
		for (int i = ((this.str.length() - 1)); i >= 0; i--) {
			reversedStr += this.str.charAt(i);
		}
		return (this.str.equals(reversedStr));
	}
	
	/**
	 * Sets instance variable to given string if they are not equal, otherwise it
	 * capitalizes it and duplicates it.
	 * 
	 * @param s - String to duplicate
	 */
	public void duplicate(String s) {
		if (this.str.equals(s)) {
			this.str = s.toUpperCase() + s.toUpperCase();
		} else {
			this.str = s;
		}
	}
}
