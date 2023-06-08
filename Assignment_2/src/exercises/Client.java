/*
 * 	The main application that the user interacts with.
 *  
 *  by: Josiah Brough (22160417)
 */


package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Client implements Play {
	private StreamingService streamingService;
	private DigitalContent currentlyStreamed;

	// Single input constructor
	public Client(StreamingService streamingService) {
		this.streamingService = streamingService;
		this.currentlyStreamed = null;
	}

	/**
	 * Gets current streaming service
	 * @return streamingService
	 */
	public StreamingService getStreamingService() {
		return this.streamingService;
	}

	/**
	 * Gets current stream.
	 * @return currentlyStreamed
	 */
	@Override
	public DigitalContent getCurrentStream() {
		return this.currentlyStreamed;
	}

	/**
	 * Checks query against the each DigitalContents instance variable within the
	 * streaming service and updates the current stream if it was matched.
	 */
	@Override
	public void stream(String query) {
		ArrayList<DigitalContent> updateStream = this.streamingService.match(query);
		if (updateStream != null) {
			this.currentlyStreamed = updateStream.get(0);
		} else {
			System.out.println("Query not found");
		}
	}

	/**
	 * Sets the current stream to null.
	 */
	@Override
	public void stop() {
		this.currentlyStreamed = null;
	}

	/**
	 * Displays the current stream.
	 */
	public void displayDigitalContent() {
		DigitalContent current = this.getCurrentStream();
		if (current == null) {
			System.out.println("There is no current stream");
		} else {
			System.out.println(current);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Adding ten DigitalContents to new streaming service instance
		StreamingService ss = new StreamingService();
		ss.add(new Film("Top Gun", "Paramount", "1986", "Tom Cruise"));
		ss.add(new Film("The Matrix", "Warner Brothers", "1999", "Keanu Reeves"));
		ss.add(new Film("Top Gun: Maverick", "Paramount", "2022", "Tom Cruise"));
		ss.add(new Film("Forest Gump", "Paramount", "1994", "Tom Hanks"));
		ss.add(new Film("Fight Club", "20th Century Studios", "1999", "Brad Pitt"));
		ss.add(new Film("Paracite", "CJ Entertainment", "2019", "Choi Woo-shik"));
		ss.add(new Music("Play", "Mute Records", "1999", "Moby"));
		ss.add(new Music("The Dark Side of the Moon", "EMI", "1973", "Pink Floyd"));
		ss.add(new Film("Whiplash", "CJ Entertainment", "2019", "Choi Woo-shik"));
		ss.add(new Film("American Psycho", "Lionsgate", "2000", "Christian Bale"));
		
		// Instantiate a Client
		Client client = new Client(ss);

		boolean running = true;
		while (running) {
			String input = " ";
			// Main menu
			System.out.println("Enter an option:\n"
					+ "A. Display Digital Content library\n"
					+ "B. Display currently streaming DigitalContent\n"
					+ "C. Match Digital Content to Stream\n"
					+ "D. Stop streaming\n"
					+ "E. Quit Client Application");

			input = sc.nextLine().toUpperCase();

			switch (input) {
			// Display streaming service
			case "A":
				System.out.println(client.getStreamingService());
				break;

			// Display current digital content
			case "B":
				client.displayDigitalContent();
				break;

			// Search for a digital content
			case "C":
				String query = "";
				System.out.println("Please enter an input query");
				query = sc.nextLine();
				client.stream(query);
				if (client.getCurrentStream() != null) {
					System.out.println("Current stream: " + client.getCurrentStream());
				} else {
					System.out.println("Nothing currently streaming");
				}
				break;

			// Stop current stream
			case "D":
				client.stop();
				System.out.println("Stopping current stream.");
				break;

			// Exit client
			case "E":
				running = false;
				System.out.println("Exiting client...");
				break;

			// Handle incorrect input
			default:
				System.out.println("Unknown command, please enter A, B, C, D or E.");
				break;
			}
		}
		// Close connection with keyboard
		sc.close();
	}

}
