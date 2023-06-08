package exercises;

public class SimpleDate {
	private int day;
	private int month;
	private int year;

	// Constructor with three inputs
	public SimpleDate(int day, int month, int year) {
		this.setDate(day, month, year);
	}
	
	// Default constructor
	public SimpleDate() {
		this.setDate(0, 0, 0);
	}

	// Getters and setters
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day > 0 && day < 32) {
			this.day = day;
		} else {
			this.day = 0;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month > 0 && month < 13) {
			this.month = month;
		} else {
			this.month = 0;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 1999 && year < 2024) {
			this.year = year;
		} else {
			this.year = 0;
		}
	}

	// Set the date given the day, month and year
	public void setDate(int day, int month, int year) {
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}

	// Overrides the default toString method
	public String toString() {
		String day;
		if (this.day != 0) {
			day = (this.day > 9) ? "" + this.day : "0" + this.day;
		} else {
			day = "?";
		}

		String month;
		if (this.month != 0) {
			month = (this.month > 9) ? "" + this.month : "0" + this.month;
		} else {
			month = "?";
		}

		String year;
		if (this.year == 0) {
			year = "?";
		} else {
			year = ""+this.year;
		}

		return (day + "/" + month + "/" + year);
	}
}
