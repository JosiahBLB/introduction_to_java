package exercises;

public class Dog {
	// Instance variables
	private String name;
	private int age;

	// Constructor
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Getters and Setters
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Output the dogs age in human years
	public int inPersonYears() {
		return (this.age * 7);
	}
	
	// String representing the dog object now prints all stored information
	public String toString() {
		return ("This dog's name is " + this.name + " and is " + this.age + " years old which is "
				+ this.inPersonYears() + " in human years!");
	}
}
