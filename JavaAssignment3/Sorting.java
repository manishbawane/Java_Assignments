package JavaAssignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		sortHalves(arr);

		System.out.println("Sorted array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		scanner.close();
	}

	public static void sortHalves(int[] arr) {
		int n = arr.length;
		int mid = n / 2;

		Arrays.sort(arr, 0, mid);

		Arrays.sort(arr, mid, n);
		reverse(arr, mid, n);
	}

	public static void reverse(int[] arr, int start, int end) {
		for (int i = start, j = end - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
