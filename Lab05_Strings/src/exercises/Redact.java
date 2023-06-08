package exercises;

public class Redact {
	private String text;

	// Single input constructor
	public Redact(String text) {
		this.text = text;
	}
	
	/**
	 * Replaces all instances of a given list of words with underscores from the text instance variable.
	 * @param words - Words to remove
	 * @return Redact - A Redact object with modified text instance variable.
	 */
	public Redact redact(String[] words) {
		String[] separated = this.text.split(" ");
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < separated.length; j++) {
				if (separated[j].contains(words[i])) {
					separated[j] = replaceWordMatch(separated[j], words[i]);
				}
			}
		}
		String output = joinStringArray(separated);
		return new Redact(output);
	}

	/**
	 * Replaces matched characters from the given word
	 * 
	 * @param word     - A word to modify.
	 * @param toRemove - A character sequence to remove from the word.
	 * @return String - The word with "_" with as the matched character sequence.
	 */
	private String replaceWordMatch(String word, String toRemove) {
		String replacement = "";
		for (int i = 0; i < toRemove.length(); i++) {
			replacement += "_";
		}
		return word.replace(toRemove, replacement);
	}

	/**
	 * Joins an array of strings
	 * 
	 * @param array - Array of strings.
	 * @return String - A single string with list elements joined with spaces.
	 */
	private String joinStringArray(String[] array) {
		String output = "";
		for (int i = 0; i < array.length; i++) {
			output += array[i] + " ";
		}
		return output;
	}

	// Overrides default toString
	public String toString() {
		return this.text;
	}

	public static void main(String[] args) {
		// Testing redact method
		Redact test = new Redact("The secret tomato sauce ingredients are: onions, carrots, garlic, whole\r\n"
				+ "tomatoes, salt, tomato paste and olive oil.");
		String[] wordsToRemove = { "tomato", "secret", "ol", "a" };
		System.out.println(test.redact(wordsToRemove));

	}

}
