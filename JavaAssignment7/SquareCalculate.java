package JavaAssignment7;

import java.util.Scanner;

public class SquareCalculate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		try {

			String userInput = scanner.nextLine();

			double number = Double.parseDouble(userInput);

			double square = number * number;
			System.out.println("The square of " + number + " is " + square + ".");
		} catch (NumberFormatException e) {
			System.out.println("Invalid input plz enter number only...");
		} finally {
			scanner.close();
		}
	}
}
