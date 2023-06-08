package exercises;

public class UniversityGradeApplication {

	public static void main(String[] args) {
		// create a grade object
		Grade p2 = new Grade(75);
		
		// Set a new grade
		p2.setPercentage(95);

		// Print out the grade
		System.out.println("Your grade is " + p2.getPercentage() + "%");
	}
}
