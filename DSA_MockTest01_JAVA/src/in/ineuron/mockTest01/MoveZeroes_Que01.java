package in.ineuron.mockTest01;

public class MoveZeroes_Que01 {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);

		// Print the modified array
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}

	public static void moveZeroes(int[] nums) {
		int nonZeroIndex = 0;

		// Move all non-zero elements to the front
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[nonZeroIndex] = nums[i];
				nonZeroIndex++;
			}
		}

		// Fill the remaining elements with zeroes
		while (nonZeroIndex < nums.length) {
			nums[nonZeroIndex] = 0;
			nonZeroIndex++;
		}
	}

}
