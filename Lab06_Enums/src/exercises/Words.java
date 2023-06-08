package exercises;

public enum Words {
	fox, quick, lazy, brown, cat, nonkeyword;

	private int count;

	private Words() {
		this.count = 0;
	}

	public void incrementCount() {
		this.count += 1;
	}

	public String toString() {
		return (this.name() + ": " + this.count);
	}

}
