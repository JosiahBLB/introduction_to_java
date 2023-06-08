package exercises;

import java.util.Scanner;

public enum TrafficLight {
	RED("Stop"), 
	YELLOW("Slow Down"), 
	GREEN("GO!");

	private String suggestion;

	// Gets suggestion
	public String getSuggestion() {
		return suggestion;
	}
	
	// Sets suggestion
	private void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	// Constructor
	private TrafficLight(String suggestion) {
		this.setSuggestion(suggestion);
	}
	
	// Checks if enum is RED or YELLOW
	public boolean stop() {
		return (this != TrafficLight.GREEN);
	}

	// Override default toString
	public String toString() {
		return ("Light: " + this.name()
			+ " | Suggestion: " + this.suggestion 
			+ " | Should stop: " + this.stop());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int stopCount = 0;
		while (true) {
			// Print user input options
			System.out.println("Enter \"GREEN\", \"YELLOW\" or \"RED\":");
			String input = sc.nextLine();

			// Get a valid input from the user
			while (input.equals("GREEN") && input.equals("YELLOW") && input.equals("RED")) {
				System.out.println("Invalid string");
				input = sc.nextLine();
			}

			// Check if RED has been entered twice
			stopCount += (input.equals("RED")) ? 1 : 0;
			if (stopCount == 2) {
				break;
			}

			// Iterate through enum for a match then print the match
			for (TrafficLight tl : TrafficLight.values()) {
				if (tl.name().equals(input)) {
					System.out.println(tl);
				}
			}
		}
		
		sc.close();
	}
}
