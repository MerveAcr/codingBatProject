package Warmup_2;

public class Q17_has271 {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 7, 1 };
		System.out.println(Q17_has271.has271(nums));
	}

	/**
	 *Given an array of ints, return true if it contains a 2, 7, 1 pattern:  
	 *a value,followed by the value plus 5, followed by the value minus 1. 
	 *Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
	 *
	 * has271([1, 2, 7, 1]) → true
	 * has271([1, 2, 8, 1]) → false
	 * has271([2, 7, 1]) → true
	 */

	/**TR
	 * Bir ints dizisi verildiğinde,2, 7, 1 deseni içeriyorsa true değerini döndürür: 
	 * bir değer, ardından değer artı 5, ardından eksi 1 değeri gelir. 
	 * Ek olarak 271, "1" doğru değerden 2 veya daha az farklı olsa bile sayılır.
	 * 
	 * has271([1, 2, 7, 1]) → true
	 * has271([1, 2, 8, 1]) → false
	 * has271([2, 7, 1]) → true
	 */

	public static boolean has271(int[] nums) {
		for (int i = 0; i < (nums.length - 2); i++) {
			int val = nums[i];
			if (nums[i + 1] == (val + 5) && // the "7" check
					Math.abs(nums[i + 2] - (val - 1)) <= 2) { // the "1" check
				return true;
			}
		}
		return false;
	}
}
