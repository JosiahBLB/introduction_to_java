package exercises;

import java.util.Scanner;

public class CartesianPoint {
	// Declaring instance variables
	float x;
	float y;

	// Constructor which passes values in for x and y
	CartesianPoint(float x, float y) {
		this.x = x;
		this.y = y;
	}

	// Default constructor that initializes x and y to zero
	CartesianPoint() {
		this.x = 0;
		this.y = 0;
	}

	/**
	 * Finds the distance between the points saved in the instance variables x and y
	 * and the given parameters x2 and y2.
	 * 
	 * @param x2 the second x coordinate
	 * @param y2 the second y coordinate
	 * @return
	 */
	public double distanceFrom(float x2, float y2) {
		return Math.sqrt(Math.pow(x2 - this.x, 2) + Math.pow(y2 - this.y, 2));
	}

	/**
	 * Returns true or false depending on if the given y coordinate is lying on the
	 * x axis.
	 * 
	 * @param y2 	y coordinate on the Cartesian plane
	 * @return boolean
	 */
	public boolean isOnXAxis(float y2) {
		if (y2 == 0)
			return true;
		return false;
	}

	/**
	 * Returns true or false depending on if the given x coordinate is lying on the
	 * y axis.
	 * 
	 * @param x2 	x coordinate on the Cartesian plane
	 * @return boolean
	 */
	public boolean isOnYAxis(float x2) {
		if (x2 == 0)
			return true;
		return false;
	}

	// Main function
	public static void main(String[] args) {
		// Create connection with keyboard
		Scanner keyboard = new Scanner(System.in);

		// Create new CartesianPoint object
		CartesianPoint point = new CartesianPoint();

		// Take user input for an x and y coordinate
		System.out.println("Please enter a x coordinate: ");
		float x2 = keyboard.nextFloat();

		System.out.println("Please enter a y coordinate: ");
		float y2 = keyboard.nextFloat();

		// Print out an example of all of the CartesianPoint methods
		System.out.println("The distance between the two points and the origin is: " + point.distanceFrom(x2, y2));
		System.out.println("Point x2 on the y-axis: " + point.isOnYAxis(x2));
		System.out.println("Point y2 is on the x-axis: " + point.isOnXAxis(y2));

		// Close connection with keyboard
		keyboard.close();
	}

}
