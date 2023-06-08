package exercises;

import java.util.Scanner;

public class AnimalApplication {

    public static void main(String[] args) {
        // Array of animals
        Animal[] animals = new Animal[4];
        // Keyboard input
        Scanner sc = new Scanner(System.in);
        

        // Get user input and validate it
        for (int i = 0; i < animals.length; i++) {
            System.out.println("Type 1 to create a Dog Object or 2 to create a Cat object (" + (i + 1) + "/4)");
            int input = 0;
            while (input != 1 && input != 2) {
                input = sc.nextInt();
                if (input != 1 && input != 2) {
                    System.out.println("Incorrect input: Please enter 1 or 2");
                }
            }
            animals[i] = (input == 1) ? new Cat() : new Dog();
        }

        // Feeding animals section
        int input = 0;
        while (input >= 0 && input < 4) {
            int n = 0;
            // Print message
            System.out.println("Select an animal to feed by entering a number within the range: 0 to 3");
            for (Animal animal : animals) {
                if (animal instanceof Cat) {
                    System.out.println(n+" "+(Cat) animal);
                } else {
                    System.out.println(n+" "+(Dog) animal);
                }
                n++;
            }
            // Handle the input
            input = sc.nextInt();
            if (input >= 0 && input < 4) {
                animals[input].feed();
            }
        }
        // Print exit message and close
        System.out.println("Input out of range, quitting.");
        sc.close();
    }
}
