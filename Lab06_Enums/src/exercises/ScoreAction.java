package exercises;

public enum ScoreAction {
	TRY(5), 
	CONVERSIONKICK(2), 
	PENALTYKICK(3), 
	DROPGOAL(3);
	
	private int worth;
	
	ScoreAction(int worth){
		this.worth = worth;
	}
	
	public int getWorth() {
		return this.worth;
	}
	
}
