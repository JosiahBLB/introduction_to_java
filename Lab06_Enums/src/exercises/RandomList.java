package exercises;

import java.util.Random;

public class RandomList {
	private int[] integers;
	private Random random = new Random();

	// Single input constructor
	public RandomList(int n) {
		if (n > 0) {
			integers = new int[n];
			for (int i = 0; i < integers.length; i++) {
				integers[i] = random.nextInt();
			}
		}
	}

	// Default constructor
	public RandomList() {
	}

	// Writes an integer at specified address
	public void write(int i, int a) {
		if (i < integers.length) {
			integers[i] = a;
		}
	}

	// Returns true if list contains a specified integer, otherwise returns false.
	public boolean contains(int n) {
		for (int num : integers) {
			if (n == num) {
				return true;
			}
		}
		return false;
	}

	// Returns a new RandomList object with specified seed.
	public RandomList rand(long seed, int n) {
		RandomList seededList = new RandomList();
		seededList.random.setSeed(seed);
		seededList.integers = new int[n];
		for (int i = 0; i < integers.length; i++) {
			seededList.integers[i] = seededList.random.nextInt();
		}
		return seededList;
	}
	
	// Check to see if two RandomList objects have the same integer array
	public boolean equals(RandomList rl) {
		if (rl.integers.length != this.integers.length) {
			return false;
		}
		for (int num : this.integers) {
			if (!rl.contains(num)) {
				return false;
			}
		}
		return true;
	}
}
