package exercises;

import java.util.Scanner;

public class Person {
	
	public static void main(String[] args)
	{
		// Create a new scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Print instructions and save user input
		System.out.println("Enter your name ");
		String name = keyboard.nextLine();
		
		System.out.println("Enter your birthday ");
		String birthday = keyboard.nextLine();
		
		System.out.println("Enter your interests ");
		String interests= keyboard.nextLine();
		
		System.out.println("Enter your favorite book ");
		String fav_book = keyboard.nextLine();
		
		System.out.println("Enter your favorite film ");
		String fav_film = keyboard.nextLine();
		
		// Print answers out to console
		System.out.println("Name: "+name+
				"\nBirthday: "+birthday+
				"\nInterests: "+interests+
				"\nFavorite book: "+fav_book+
				"\nFavorite film: "+fav_film);
		
		// Disconnect communications with keyboard
		keyboard.close();
	}
}