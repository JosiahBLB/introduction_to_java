package exercises;

import java.util.ArrayList;

public class NumberList {

	public String frequencies(int[] input) {
		String out = "";
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int number : input) {
			if (!nums.contains(number)) {
				nums.add(number);
			}
		}
		nums.sort(null);
		for (int number : nums) {
			int count = 0;
			for (int input_number : input) {
				if (input_number == number) {
					count += 1;
				}
			}
			out += number + " has frequency " + count + "\n";
		}
		return out;
	}

	public char[] underScore(String input, int p) {
		char[] out = new char[input.length() * (p + 1)];
		for (int i = 0, j = 0; i < input.length(); i++, j+=(p + 1)) {
			out[j] = input.charAt(i);
			for(int k = 1; k < (p+1); k++) {
				out[j+k] = '_';			
			}
		}
		return out;
	}

	public static void main(String[] args) {
		NumberList nl = new NumberList();
		System.out.println(nl.frequencies(new int[] { 2, 9, 2, 1, 2, 1, 7, 7, 9, 9, 9, 0 }));
		System.out.println(nl.underScore("Josiah", 5));
	}
}
