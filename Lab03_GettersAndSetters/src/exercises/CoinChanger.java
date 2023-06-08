package exercises;

public class CoinChanger {
	// Instance variables
	private int ten;
	private int twenty;
	private int fifty;
	private int oneDollar;
	private int twoDollar;
	
	// Getter and Setter methods
	public int getTen() {
		return ten;
	}

	public void setTen(int ten) {
		this.ten = ten;
	}

	public int getTwenty() {
		return twenty;
	}

	public void setTwenty(int twenty) {
		this.twenty = twenty;
	}

	public int getFifty() {
		return fifty;
	}

	public void setFifty(int fifty) {
		this.fifty = fifty;
	}

	public int getOneDollar() {
		return oneDollar;
	}

	public void setOneDollar(int oneDollar) {
		this.oneDollar = oneDollar;
	}

	public int getTwoDollar() {
		return twoDollar;
	}

	public void setTwoDollar(int twoDollar) {
		this.twoDollar = twoDollar;
	}

	// Returns the total amount of coins in cents
	public int coinsAsCents() {
		return (ten*10 + twenty*20 + fifty*50 + oneDollar*100 + twoDollar*200);
	}
	
	// Returns the total amount of dollar coins
	public int dollars() {
		return (this.coinsAsCents()/100);
	}
	
	// Returns the remainder of cent coins
	public int cents() {
		return (this.coinsAsCents()%100);
	}
}
