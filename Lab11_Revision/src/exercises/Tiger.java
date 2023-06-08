package exercises;

public class Tiger extends Feline{
	@Override
	public void soundsLike() {
		super.soundsLike();
		System.out.println("Grrrrrr (Weight: "+this.getWeight()+")");
	}
}