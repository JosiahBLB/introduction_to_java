package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class StudentMarks implements Comparable<StudentMarks>{
	private String name;
	private ArrayList<Double> marks;
	
	/**
	 * Single input constructor
	 * @param name
	 */
	public StudentMarks(String name) {
		this.marks = new ArrayList<Double>();
		this.name = name;
	}
	
	/**
	 * Adds a mark to the StudentMarks marks array.
	 * @param mark
	 */
	public void add(Double mark) {
		this.marks.add(mark);
	}
	
	/**
	 * Returns the sum of the marks ArrayList
	 * @return Double sum
	 */
	public Double sum() {
		Double sum = 0.0;
		for(Double mark : this.marks) {
			sum += mark;
		}
		return sum;
	}

	/**
	 * Returns the average of the marks ArrayList
	 * @return Double average
	 */
	public Double average() {
		Double sum = this.sum();
		return (double) sum / marks.size();
	}

	@Override
	public int compareTo(StudentMarks sm) {
		return this.average().compareTo(sm.average());
	}
	
	@Override
	public String toString() {
		return "Name: "+this.name+", Marks: "+this.average();
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		// Instantiate 5 StudentMarks objects
		StudentMarks s1 = new StudentMarks("Chad");
		StudentMarks s2 = new StudentMarks("Suzan");
		StudentMarks s3 = new StudentMarks("Bob");
		StudentMarks s4 = new StudentMarks("William");
		StudentMarks s5 = new StudentMarks("Dan");
		
		// Make a StudentMarks ArrayList
		ArrayList<StudentMarks> sm_array = new ArrayList<StudentMarks>();
		sm_array.add(s1);
		sm_array.add(s2);
		sm_array.add(s3);
		sm_array.add(s4);
		sm_array.add(s5);
		
		// Add random marks to each of the students
		for(StudentMarks sm : sm_array) {
			for(int i = 0; i < 10; i++) {
				sm.add(rand.nextDouble());
			}
		}
		
		// Print out the results
		System.out.println(sm_array);
		Collections.sort(sm_array);
		System.out.println(sm_array);
	}


}
