package exercises;

import java.util.ArrayList;

public class StudentList {
	private ArrayList<Student> students;

	/**
	 * Default constructor
	 */
	public StudentList() {
		this.students = new ArrayList<Student>();
	}

	/**
	 * Adds a new student to the student array.
	 * @param Student
	 */
	public void addStudent(Student s) {
		this.students.add(s);
	}
	
	/**
	 * Checks to see if the Student array of the StudentList class contains a given student.
	 * @param Student
	 * @return boolean
	 */
	public boolean contains(Student s) {
		return this.students.contains(s);
	}

	@Override
	public String toString() {
		String out = "";
		for (Student student : this.students) {
			out += student + "\n";
		}
		return out;
	}

	public static void main(String[] args) {
		StudentList sl = new StudentList();
		sl.addStudent(new Student("Joe", "1234"));
		sl.addStudent(new Student("John", "5678"));
		System.out.println(sl);	
	}
}
