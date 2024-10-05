package JavaAssignment7;

import java.util.Scanner;

class NoVowelException extends Exception {
	public NoVowelException(String message) {
		super(message);
	}
}

public class VowelChecker {

	public static void checkForVowels(String input) throws NoVowelException {
		String lowerCaseInput = input.toLowerCase();

		if (!lowerCaseInput.contains("a") && !lowerCaseInput.contains("e") && !lowerCaseInput.contains("i")
				&& !lowerCaseInput.contains("o") && !lowerCaseInput.contains("u")) {
			throw new NoVowelException("The string does not contain any vowels.");
		}

		System.out.println("The string contains vowels.");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String userInput = scanner.nextLine();

		try {

			checkForVowels(userInput);
		} catch (NoVowelException e) {

			System.out.println("Error: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
