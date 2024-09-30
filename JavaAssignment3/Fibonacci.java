package JavaAssignment3;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of terms in the Fibonacci series: ");
		int n = scanner.nextInt();

		System.out.println("Fibonacci Series:");
		generateFibonacciIterative(n);

		scanner.close();
	}

	public static void generateFibonacciIterative(int n) {
		int a = 0, b = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}
		System.out.println();
	}
}
