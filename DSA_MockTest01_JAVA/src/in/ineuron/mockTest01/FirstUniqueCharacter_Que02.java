package in.ineuron.mockTest01;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter_Que02 {
	public static void main(String[] args) {
		String s = "leetcode";
		int index = firstUniqChar(s);
		System.out.println(index);
	}

	public static int firstUniqChar(String s) {

		// Create a HashMap to count the frequency of each character
		Map<Character, Integer> frequencyMap = new HashMap<>();

		// Count the frequency of each character
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
		}

		// Find the first non-repeating character and return its index
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (frequencyMap.get(c) == 1) {
				return i;
			}
		}

		// If no non-repeating character is found, return -1
		return -1;
	}
}
