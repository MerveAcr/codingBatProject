package Array_1;

public class Q15_double23 {

	public static void main(String[] args) {
		int nums[] = { 3, 3 };
		System.out.println(Q15_double23.double23(nums));

	}

	/**
	 * Given an int array, return true if the array contains 2 twice, or 3 twice. 
	 * The array will be length 0, 1, or 2.
	 * 
	 * double23([2, 2]) → true
	 * double23([3, 3]) → true
	 * double23([2, 3]) → false
	 */

	/**TR 
	 * Bir int dizisi verildiğinde, dizi iki kez 2 veya iki kez 3 içeriyorsa true değerini döndürür. 
	 * Dizi uzunluğu 0, 1 veya 2 olacaktır.
	 * 
	 * double23([2, 2]) → true
	 * double23([3, 3]) → true
	 * double23([2, 3]) → false
	 */

	public static boolean double23(int[] nums) {
		if (nums.length <= 1) {
			return false;
		} else if (nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3) {
			return true;
		} else {
			return false;
		}
	}
}
