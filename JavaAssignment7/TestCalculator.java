package JavaAssignment7;

import java.util.Scanner;

public class TestCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.print("Enter first integer: ");
			int firstNumber = Integer.parseInt(scanner.nextLine());

			System.out.print("Enter second integer: ");
			int secondNumber = Integer.parseInt(scanner.nextLine());

			Calculator addCalculator = new Calculator(firstNumber, secondNumber);
			Calculator subtractCalculator = new Calculator(firstNumber, secondNumber);
			Calculator multiplyCalculator = new Calculator(firstNumber, secondNumber);
			Calculator divideCalculator = new Calculator(firstNumber, secondNumber);

			System.out.println("Addition: " + addCalculator.Add());
			System.out.println("Subtraction: " + subtractCalculator.Subtract());
			System.out.println("Multiplication: " + multiplyCalculator.Multiply());
			System.out.println("Division: " + divideCalculator.Division());

		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter valid integers.");
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
