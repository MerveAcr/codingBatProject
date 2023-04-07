package Array_1;

import java.util.Arrays;

public class Q16_fix23 {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 1 };
		System.out.println(Arrays.toString(Q16_fix23.fix23(nums)));

	}

	/**
	 * Given an int array length 3, 
	 * if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. 
	 * Return the changed array.
	 * 
	 * fix23([1, 2, 3]) → [1, 2, 0]
	 * fix23([2, 3, 5]) → [2, 0, 5]
	 * fix23([1, 2, 1]) → [1, 2, 1]
	 */

	/**TR
	 * Uzunluğu 3 olan bir int dizi  verildiğinde, 
	 * dizide 2'nin hemen ardından bir 3 varsa, 3 öğesini 0'a ayarlayın. 
	 * Değiştirilen diziyi döndürün.
	 * 
	 * fix23([1, 2, 3]) → [1, 2, 0]
	 * fix23([2, 3, 5]) → [2, 0, 5]
	 * fix23([1, 2, 1]) → [1, 2, 1]
	 */

	public static int[] fix23(int[] nums) {
		if (nums[0] == 2 && nums[1] == 3) {
			nums[1] = 0;
		} else if (nums[1] == 2 && nums[2] == 3) {
			nums[2] = 0;
		}
		return nums;
	}
}
