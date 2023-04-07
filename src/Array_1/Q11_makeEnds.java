package Array_1;

import java.util.Arrays;

public class Q11_makeEnds {

	public static void main(String[] args) {
		int nums[] = { 7, 4, 6, 2 };
		System.out.println(Arrays.toString(Q11_makeEnds.makeEnds(nums)));

	}

	/**
	 * Given an array of ints, 
	 * return a new array length 2 containing the first and last elements from the original array. 
	 * The original array will be length 1 or more.
	 * 
	 * makeEnds([1, 2, 3]) → [1, 3]
	 * makeEnds([1, 2, 3, 4]) → [1, 4]
	 * makeEnds([7, 4, 6, 2]) → [7, 2]
	 */

	/**TR
	 * Bir dizi ints verildiğinde, 
	 * orijinal dizinin ilk ve son öğelerini içeren uzunluğu 2 olan yeni bir dizi  döndürün. 
	 * Orijinal dizi uzunluk 1 veya daha fazla olacaktır.
	 * 
	 * makeEnds([1, 2, 3]) → [1, 3]
	 * makeEnds([1, 2, 3, 4]) → [1, 4]
	 * makeEnds([7, 4, 6, 2]) → [7, 2]
	 */

	public static int[] makeEnds(int[] nums) {
		return new int[] { nums[0], nums[nums.length - 1] };
	}
}
