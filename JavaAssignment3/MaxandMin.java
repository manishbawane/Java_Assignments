package JavaAssignment3;

import java.util.Arrays;

public class MaxandMin {
	public static void main(String[] args) {

		int[] array = { 10, 20, 4, 45, 99, 45 };

		Integer secondMax = findSecondMax(array);
		Integer secondMin = findSecondMin(array);

		if (secondMax != null) {
			System.out.println("Second Maximum Element: " + secondMax);
		} else {
			System.out.println("No second maximum element found.");
		}

		if (secondMin != null) {
			System.out.println("Second Minimum Element: " + secondMin);
		} else {
			System.out.println("No second minimum element found.");
		}
	}

	public static Integer findSecondMax(int[] array) {
		if (array.length < 2)
			return null;

		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int num : array) {
			if (num > firstMax) {
				secondMax = firstMax;
				firstMax = num;
			} else if (num > secondMax && num < firstMax) {
				secondMax = num;
			}
		}

		return secondMax == Integer.MIN_VALUE ? null : secondMax;
	}

	public static Integer findSecondMin(int[] array) {
		if (array.length < 2)
			return null;

		int firstMin = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;

		for (int num : array) {
			if (num < firstMin) {
				secondMin = firstMin;
				firstMin = num;
			} else if (num < secondMin && num > firstMin) {
				secondMin = num;
			}
		}

		return secondMin == Integer.MAX_VALUE ? null : secondMin; // Return null if not found
	}
}
