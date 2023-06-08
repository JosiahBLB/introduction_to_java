package exercises;

public class ParkingSystem {
	private int bigSpaces;
	private int medSpaces;
	private int smallSpaces;
	
	// Constructor
	public ParkingSystem(int big, int med, int small) {
		this.bigSpaces = (big < 0)? 10: big;
		this.medSpaces = (med < 0)? 10: med;
		this.smallSpaces = (small < 0)? 10: small;
	}
	
	// Checks if a carpark is available
	public boolean addCar(int carType) {
		switch(carType) {
		case 1: // Big
			return (bigSpaces > 0)? true: false;
		case 2: // Med
			return (medSpaces > 0)? true: false;
		case 3: // Small
			return (smallSpaces > 0)? true: false;
		default:
			return false;
		}
	}
	
	public String toString() {
		return "Big Spaces: "+this.bigSpaces+", Medium Spaces: "+this.medSpaces+" Small Spaces: "+this.smallSpaces;
	}
	
	public static void main(String[] args) {
		ParkingSystem ps = new ParkingSystem(10, 10, 0);
		System.out.println(ps.addCar(1));
		System.out.println(ps.addCar(2));
		System.out.println(ps.addCar(3));
		System.out.println(ps);
	}
}
