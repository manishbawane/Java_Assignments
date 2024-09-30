package JavaAssignment3;

import java.util.Scanner;

public class RotationEle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.print("Enter number of positions to rotate: ");
		int k = scanner.nextInt();

		k = k % n;

		int[] leftRotated = rotateLeft(arr, k);
		System.out.println("Array after left rotation:");
		printArray(leftRotated);

		int[] rightRotated = rotateRight(arr, k);
		System.out.println("Array after right rotation:");
		printArray(rightRotated);

		scanner.close();
	}

	public static int[] rotateLeft(int[] arr, int k) {
		int n = arr.length;
		int[] rotated = new int[n];

		for (int i = 0; i < n; i++) {
			rotated[i] = arr[(i + k) % n];
		}
		return rotated;
	}

	public static int[] rotateRight(int[] arr, int k) {
		int n = arr.length;
		int[] rotated = new int[n];

		for (int i = 0; i < n; i++) {
			rotated[i] = arr[(i - k + n) % n];
		}
		return rotated;
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
