package JavaAssignment7;

import java.util.Scanner;

public class IntegerArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int n = scanner.nextInt();

		int[] array = new int[n];

		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.print("Enter the position of the element you want to retrieve (0 to " + (n - 1) + "): ");
		int position = scanner.nextInt();

		try {

			System.out.println("Value at position " + position + ": " + array[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: The position " + position + " is out of bounds for the array.");
		} finally {
			scanner.close();
		}
	}
}
