package exercises;

public class Student {
	private String name;
	private String id;
	
	/**
	 * Two input parameter constructor
	 * @param name
	 * @param id
	 */
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	/**
	 * Checks if two student objects are the same by checking their ID's
	 * @param Student
	 * @return boolean
	 */
	public boolean equals(Student s) {
		return (this.id.equalsIgnoreCase(s.id));
	}
	
	@Override
	public String toString() {
		return this.name+" ("+this.id+")";
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("John", "5678");
		Student s2 = new Student("John", "5678");
		Student s3 = new Student("Jack", "4345");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
