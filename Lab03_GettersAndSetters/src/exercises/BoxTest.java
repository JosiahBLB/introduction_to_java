package exercises;

public class BoxTest {

	public static void main(String[] args) {
		// Instantiate several boxes
		Box box_1 = new Box(10, 10, 10);
		Box box_2 = new Box(20, 20, 20);
		Box box_3 = new Box(30, 30, 30);
		
		// Print the dimensions
		System.out.println(box_1 + " < " + box_2 + " < " + box_3);
		
		// Example of the fit method
		System.out.println("Box 2 into box 1 possible? "+box_1.fits(box_2));
		System.out.println("Box 1 into box 2 possible? "+box_2.fits(box_1));
		
		// Example of the fit method with two parameters
		System.out.println("Box 3 into box 2 into box 1 possible? "+box_1.fits(box_2, box_3));
		System.out.println("Box 1 into box 2 into box 3 possible? "+box_3.fits(box_2, box_1));
	}
}
