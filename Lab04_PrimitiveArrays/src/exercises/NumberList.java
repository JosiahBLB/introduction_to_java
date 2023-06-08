package exercises;

import java.util.Random;

public class NumberList {
	// Instance variables
	private int[] array;
	private Random rand;
	
	// Default constructor
	public NumberList() {
		this.array = new int[10];
	}
	
	// Constructor that initializes random values for the array
	public NumberList(int r) {
		this();
		this.rand = new Random();
		for (int i = 0; i < this.array.length; i++) {
			this.array[i] = this.rand.nextInt(r - 1);
		}
	}
	
	// Returns the length of the array
	public int size() {
		return this.array.length;
	}
	
	// Overrides the default string representation of the object
	public String toString() {
		String output = "[";
		for (int i = 0; i < this.array.length; i++) {
			output += (i < (this.array.length - 1)) ? this.array[i] + ", " : this.array[i] + "]";
		}
		return output;
	}
	
	// Returns true if the given index is valid for the array otherwise returns false
	private boolean isValid(int i) {
		return (i < this.size() && i > -1);
	}

	// Updates a value within the array at a given index
	public void update(int i, int value) {
		if (this.isValid(i)) {
			this.array[i] = value;
		}
	}
	
	// Returns the minimum value of the array
	public int min() {
		int min = 0;
		for (int i = 0; i < this.array.length; i++) {
			min = (this.array[i] < min) ? this.array[i] : min;
		}
		return min;
	}
	
	// Returns the maximum value of the array
	public int max() {
		int max = 0;
		for (int i = 0; i < this.array.length; i++) {
			max = (this.array[i] > max) ? this.array[i] : max;
		}
		return max;
	}
	
	// Returns the amount of non-zero numbers in the array
	public int nonZero() {
		int count = 0;
		for (int i = 0; i < this.array.length; i++) {
			count += (this.array[i] == 0) ? 0 : 1;
		}
		return count;
	}
	
	// Returns the average of the values in the array
	public double average() {
		double sum = 0.0;
		for (int i = 0; i < this.array.length; i++) {
			sum += this.array[i];
		}
		return sum / this.array.length;
	}
	
	// Returns a number at a given index of the array
	public int getNumber(int i) {
		return this.array[i];
	}
	
	// Updates and takes the absolute value for each element in the array
	public void absolute() {
		for (int i = 0; i < this.array.length; i++) {
			this.array[i] = Math.abs(this.array[i]);
		}
	}
	
	// Updates and scales each element in the array by a factor f
	public void scale(int f) {
		for (int i = 0; i < this.array.length; i++) {
			this.array[i] = this.array[i] * f;
		}
	}
	
	// Returns a new array of length [10], starting with the defined range of NumberList's array
	public NumberList sub(int startIndex, int endIndex) {
		NumberList output = new NumberList();
		for (int i = startIndex, j = 0; i <= endIndex; i++, j++) {
			output.array[j] = this.array[i];
		}
		return output;
	}

	// A test showing the working functionality of all of the methods of NumberList
	public String NumberListTest() {
		String originalToString = this.toString();
		this.scale(-2);
		String scaledString = this.toString();
		this.update(4, 10);
		String updatedIndex4 = this.toString();
		this.absolute();

		return (    "Array: ............... " + originalToString
				+ "\nScaled by -2: ........ " + scaledString
				+ "\nUpdate index 4 to 10:  " + updatedIndex4
				+ "\nAbsolute: ............ "+ this.toString()
				+ "\nMin: ................. " + this.min()
				+ "\nMax: ................. " + this.max()
				+ "\nNum of Non-zero: ..... " + this.nonZero()
				+ "\nAverage: ............. " + this.average()
				+ "\nGet index 4: ......... " + this.getNumber(4)
				+ "\nNumbers from 3 to 8: . " + this.sub(3, 8));
	}

	public static void main(String[] args) {
		// Initialize two NumberList objects
		NumberList list1 = new NumberList(5);
		NumberList list2 = new NumberList();
		
		// Print out the test method string
		System.out.println(list1.NumberListTest() + "\n");
		System.out.println(list2.NumberListTest());
	}

}
