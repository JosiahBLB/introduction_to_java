package exercises;

public class Sphere {
	
	// Instance variable
	private double diameter;
	
	
	// Constructor
	public Sphere(double diameter) {
		this.diameter = diameter;
	}
	
	// Getter
	public double getDiameter() {
		return this.diameter;
	}
	
	// Setter
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	// Calculates the radius
	public double radius() {
		return this.diameter / 2;
	}
	
	// Calculates the volume
	public double volume() {
		return ((4 * Math.PI * Math.pow(this.radius(), 3)) / 3);
	}

	// Calculates the surface area
	public double surfaceArea() {
		return (4 * Math.PI * Math.pow(this.radius(), 2));
	}
	
	// Sets the string representation to output object information
	public String toString() {
		return ("Diameter: " + this.diameter + "\tRadius: " + this.radius() + "\tVolume: " + this.volume()
				+ "\tSurface area: " + this.surfaceArea());
	}
}
