package exercises;

public class Count {
	private String value;
	
	// Default constructor
	Count() {
		this.value = "";
	}
	
	// Adds one "S" to the value
	public void succ() {
		this.value += "S";
	}
	
	// Removes one "S" from the value
	public void pred() {
		String updateVal = "";
		for (int i = 0; i < (this.value.length() - 1); i++) {
			updateVal += this.value.charAt(i);
		}
		this.value = updateVal;
	}

	// Overrides the default toString method
	public String toString() {
		return "" + this.value.length();
	}

	// Adds two Count objects
	public void add(Count count) {
		this.value += count.value;
	}
	
	// Subtracts two Count objects
	public void subtract(Count count) {
		String updateVal = "";
		int length = (this.value.length() - count.value.length());
		for (int i = 0; i < length; i++) {
			updateVal += "S";
		}
		this.value = updateVal;
	}

	public static void main(String[] args) {
		Count a = new Count();
		Count b = new Count();

		// Test the succ() method
		for (int i = 0; i < 5; i++) {
			a.succ();
		}

		for (int i = 0; i < 8; i++) {
			b.succ();
		}
		System.out.println("Initial values for a: " + a);
		System.out.println("Initial values for b: " + b);

		// Test the pred() method
		b.pred();
		System.out.println("b = b - 1: " + b);

		// Test the add() method
		a.add(b);
		System.out.println("a = a + b: " + a);

		// Test the subtract() method
		a.subtract(b);
		System.out.println("a = a - b: " + a);
	}
}
