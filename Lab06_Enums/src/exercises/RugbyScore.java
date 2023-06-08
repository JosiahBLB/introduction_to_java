package exercises;

public class RugbyScore {
	private String name;
	private int score;
	
	// Constructor
	public RugbyScore(String name) {
		this.name = name;
	}
	
	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// Overrides default toString
	public String toString() {
		return (this.name + ": " + this.score);
	}
	
	// Updates the score
	public void score(ScoreAction action) {
		this.score += action.getWorth();
	}

	public static void main(String[] args) {
		RugbyScore blues = new RugbyScore("Blues");
		System.out.println(blues);
		blues.score(ScoreAction.TRY);
		System.out.println(blues);
		blues.score(ScoreAction.DROPGOAL);
		System.out.println(blues);
	}

}
