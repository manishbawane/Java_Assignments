package JavaAssignment3;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		countEvenOdd(arr);

		scanner.close();
	}

	public static void countEvenOdd(int[] arr) {
		int evenCount = 0;
		int oddCount = 0;

		for (int num : arr) {
			if (num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		System.out.println("Number of even elements: " + evenCount);
		System.out.println("Number of odd elements: " + oddCount);
	}
}
