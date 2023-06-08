package exercises;

public class MultiSphere {

	public static void main(String[] args) {
		// Instantiate several ball objects
		Sphere golf_ball = new Sphere(30.0);
		Sphere soccer_ball = new Sphere(200.0);
		Sphere basket_ball = new Sphere(300.0);
		
		// Print information regarding spheres
		System.out.println(golf_ball+"\n"+soccer_ball+"\n"+basket_ball);
		
		// Change dimensions of each object
		golf_ball.setDiameter(50);
		soccer_ball.setDiameter(500);
		basket_ball.setDiameter(30);
		
		// Reprint information
		System.out.println("\n"+golf_ball+"\n"+soccer_ball+"\n"+basket_ball);
	}
}
