package JavaAssignment3;

public class MaxandAvg {
	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50 };

		int maxElement = findMax(array);
		double average = calculateAverage(array);

		System.out.println("Maximum Element: " + maxElement);
		System.out.println("Average: " + average);
	}

	public static int findMax(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static double calculateAverage(int[] array) {
		double sum = 0;
		for (int num : array) {
			sum += num;
		}
		return sum / array.length;
	}
}
