package JavaAssignment3;

import java.util.HashMap;
import java.util.Map;

public class CountNum {
	public static void main(String[] args) {

		int[] array = { 1, 2, 2, 3, 4, 4, 4, 5 };

		Map<Integer, Integer> occurrences = countOccurrences(array);

		for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
			System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
		}
	}

	public static Map<Integer, Integer> countOccurrences(int[] array) {
		Map<Integer, Integer> countMap = new HashMap<>();

		for (int num : array) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

		return countMap;
	}
}
