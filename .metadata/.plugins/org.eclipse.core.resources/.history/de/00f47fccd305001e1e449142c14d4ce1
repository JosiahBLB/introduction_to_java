package exercises;
import java.util.Random;
import java.util.Scanner;

public class ShapeApp {
    public static Random rand = new Random();
    public static int MAX_RAND_VAL = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        Shape shape;
        boolean running = true;
        // Main application
        while (running) {
            // Print options
            System.out.println("1 Create a Circle Object\n"
                    + "2 Create a Rectangle object\n"
                    + "3 Stop");
            input = sc.nextInt();

            // Handle user input by either calculating area of chosen shape or exiting
            running = (input == 3) ? false : true;
            if (input < 1 && input > 3) {
                System.out.println("Error: invalid input");
            }
            if (input == 1) {
                shape = new Circle(rand.nextInt(MAX_RAND_VAL));
                System.out.println("The area of the circle is: " + shape.computeArea());
            }
            if (input == 2) {
                shape = new Rectangle(rand.nextInt(MAX_RAND_VAL), rand.nextInt(MAX_RAND_VAL));
                System.out.println("The area of the rectangle is: " + shape.computeArea());
            }
        }
        // Close connection to keyboard input
        sc.close();
    }
}
