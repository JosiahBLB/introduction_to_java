package exercises;

import java.util.ArrayList;

public class NumberList {
	private ArrayList<Integer> numbers;

	/**
	 * Single input constructor, takes and parses a string.
	 * @param numberString
	 */
	public NumberList(String numberString) {
		this.numbers = new ArrayList<Integer>();
		String[] numbers = numberString.split(" ");
		for(String number : numbers) {
			this.numbers.add(Integer.valueOf(number));
		}
	}
	
	/**
	 * Single input constructor, takes an integer array list.
	 * @param arrayList
	 */
	public NumberList(ArrayList<Integer> arrayList) {
		this.numbers = arrayList;
	}
	
	/**
	 * Returns integer array list
	 * @return ArrayList
	 */
	public ArrayList<Integer> getNumbers(){
		return this.numbers;
	}
	
	/**
	 * Returns the sum of the array list instance variable.
	 * @return Integer sum
	 */
	public Integer sum() {
		Integer sum = 0;
		for(Integer number : this.numbers) {
			sum += number;
		}
		return sum;
	}
	
	/**
	 * Returns the average of the array list instance variable.
	 * @return
	 */
	public Double average() {
		Integer sum = this.sum();
		return (double) sum / numbers.size();
	}
	
	/**
	 * Merges two NumberList number arrays and returns a new instance of that.
	 * @param numberList 
	 * @return NumberList mergedNumberList
	 */
	public NumberList merge(NumberList numberList) {
		for (Integer number : this.numbers) {
			numberList.numbers.add(number);
		}
		return numberList;
	}
	
	@Override
	public String toString() {
		return this.numbers.toString();
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++) {
			nums.add(i);
		}
		// Test constructors
		NumberList nl = new NumberList(nums);
		NumberList nl_2 = new NumberList("11 22 33 44");
		
		// Test functions
		System.out.println(nl);	
		System.out.println(nl.average());	
		System.out.println(nl.sum());	
		System.out.println(nl_2);	
		System.out.println(nl.merge(nl_2));
	}
}
