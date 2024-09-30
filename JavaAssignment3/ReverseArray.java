package JavaAssignment3;

public class ReverseArray {
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		reverseArray(array);

		printArray(array);
	}

	public static void reverseArray(int[] array) {
		int left = 0;
		int right = array.length - 1;

		while (left < right) {

			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;

			left++;
			right--;
		}
	}

	public static void printArray(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
