package Warmup_2;

public class Q16_noTriples {

	public static void main(String[] args) {
		int nums[] = { 1, 1, 2, 2, 2, 1 };
		System.out.println(Q16_noTriples.noTriples(nums));
	}

	/**
	 * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. 
	 * Return true if the array does not contain any triples.
	 * 
	 * noTriples([1, 1, 2, 2, 1]) → true
	 * noTriples([1, 1, 2, 2, 2, 1]) → false
	 * noTriples([1, 1, 1, 2, 2, 2, 1]) → false
	 */

	/**TR
	 * Bir dizi ints verildiğinde, üçlünün dizide arka arkaya 3 kez görünen bir değer olduğunu söyleyeceğiz. 
	 * Dizi herhangi bir üçlü içermiyorsa true değerini döndürün.
	 * 
	 * noTriples([1, 1, 2, 2, 1]) → true
	 * noTriples([1, 1, 2, 2, 2, 1]) → false
	 * noTriples([1, 1, 1, 2, 2, 2, 1]) → false
	 */

	public static boolean noTriples(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			int first = nums[i];
			if (nums[i + 1] == first && nums[i + 2] == first) {
				return false;
			}
		}
		return true;
	}
}
