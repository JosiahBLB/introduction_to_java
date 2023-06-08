package exercises;

import java.util.Scanner;

public class WordScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Take input from user
		System.out.println("Enter a sentence:");
		String input = sc.nextLine();

		// Count words in sentence matching words in Words enum
		String[] inputWords = input.split(" ");
		boolean countChanged = false;
		for (String inputWord : inputWords) {
			for (Words word : Words.values()) {
				if (inputWord.equals(word.name())) {
					word.incrementCount();
					countChanged = true;
				}
			}
			if (!countChanged) {
				Words.nonkeyword.incrementCount();
			}
			countChanged = false;
		}

		// Print out word occurrences
		for (Words word : Words.values()) {
			System.out.println(word);
		}
		sc.close();
	}

}
