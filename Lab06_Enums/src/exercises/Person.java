package exercises;

public class Person {
	private String name;
	private Role role;

	// Constructor
	public Person(String name, Role role) {
		this.setName(name);
		this.role = role;
	}
	
	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Checks if persons role is equal
	public boolean equals(Person person) {
		return (this.role == person.role);
	}

	public static void main(String[] args) {
		Person p1 = new Person("Josiah", Role.Student);
		Person p2 = new Person("Ken", Role.Academic);
		Person p3 = new Person("Avaram", Role.Student);
		
		System.out.println(p1.equals(p2)); // Should be false
		System.out.println(p1.equals(p3)); // Should be true
	}
}
