package exercises;

public abstract class Animal {
	protected double weight;
	
	public Animal() {
		this.weight = 1.0;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public abstract void soundsLike();
}
