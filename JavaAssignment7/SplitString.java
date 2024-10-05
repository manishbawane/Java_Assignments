package JavaAssignment7;

import java.util.StringTokenizer;

public class SplitString {
	public static void main(String[] args) {
		String input = "Hello World";
		StringTokenizer tokenizer = new StringTokenizer(input);

		try {

			String firstWord = tokenizer.nextToken();
			System.out.println("First word: " + firstWord);

			String secondWord = tokenizer.nextToken();
			System.out.println("Second word: " + secondWord);

			String thirdWord = tokenizer.nextToken();
			System.out.println("Third word: " + thirdWord);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			System.out.println("There are not enough tokens....");
		}
	}
}
