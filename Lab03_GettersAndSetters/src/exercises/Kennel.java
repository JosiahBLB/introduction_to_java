package exercises;

public class Kennel {

	public static void main(String[] args) {
		// Instantiate several dogs
		Dog dog_1 = new Dog("John", 45);
		Dog dog_2 = new Dog("Jimmy", 3);
		Dog dog_3 = new Dog("Tom", 6);
		
		// Print out information on dogs
		System.out.println(dog_2.getAge()+" in dog years is "+dog_2.inPersonYears()+" in human years!");
		System.out.println(dog_1);
		System.out.println(dog_3);
	}
}
