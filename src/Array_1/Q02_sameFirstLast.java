package Array_1;

public class Q02_sameFirstLast {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3 };
		System.out.println(Q02_sameFirstLast.sameFirstLast(nums));
	}

	/**
	 * Given an array of ints, 
	 * return true if the array is length 1 or more, 
	 * and the first element and the last element are equal.
	 * 
	 * sameFirstLast([1, 2, 3]) → false
	 * sameFirstLast([1, 2, 3, 1]) → true
	 * sameFirstLast([1, 2, 1]) → true
	 */

	/**TR
	 * Bir int dizisi verildiğinde, 
	 * dizinin uzunluğu 1 veya daha fazlaysa ve ilk öğe ile son öğe eşitse true değerini döndürür.
	 * 
	 * sameFirstLast([1, 2, 3]) → false
	 * sameFirstLast([1, 2, 3, 1]) → true
	 * sameFirstLast([1, 2, 1]) → true
	 */

	public static boolean sameFirstLast(int[] nums) {
		if (nums.length >= 1 && nums[0] == nums[nums.length - 1])
			return true;
		else
			return false;
	}
}
