package JavaAssignment7;

import java.util.Scanner;

public class ConvertToInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string to convert to an integer: ");
		String userInput = scanner.nextLine();

		try {

			int number = Integer.parseInt(userInput);
			System.out.println("The converted integer is: " + number);
		} catch (NumberFormatException e) {

			System.out.println("Invalid input! Please enter a valid integer.");
		} finally {
			scanner.close();
		}
	}
}
