package Warmup_2;

public class Q10_array123 {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 1, 2, 3 };
		System.out.println(Q10_array123.array123(nums));

	}

	/**
	 * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
	 * 
	 * array123([1, 1, 2, 3, 1]) → true
	 * array123([1, 1, 2, 4, 1]) → false
	 * array123([1, 1, 2, 1, 2, 3]) → true
	 */

	/** TR
	 * Bir int dizisi verildiğinde, dizide bir yerde 1, 2, 3 sayı dizisi görünüyorsa true değerini döndürür.
	 * 
	 * array123([1, 1, 2, 3, 1]) → true
	 * array123([1, 1, 2, 4, 1]) → false
	 * array123([1, 1, 2, 1, 2, 3]) → true
	 */

	public static boolean array123(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
				return true;
			}
		}
		return false;
	}
}
