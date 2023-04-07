package Array_1;

import java.util.Arrays;

public class Q21_swapEnds {

	public static void main(String[] args) {
		int nums[] = { 8, 6, 7, 9, 5 };
		System.out.println(Arrays.toString(Q21_swapEnds.swapEnds(nums)));

	}

	/**
	 * Given an array of ints, swap the first and last elements in the array. 
	 * Return the modified array. 
	 * The array length will be at least 1.
	 * 
	 * swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
	 * swapEnds([1, 2, 3]) → [3, 2, 1]
	 * swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
	 */

	/**TR
	 * Bir dizi ints verildiğinde, dizideki ilk ve son öğeleri değiştirin. 
	 * Değiştirilen diziyi döndür. 
	 * Dizi uzunluğu en az 1 olacaktır.
	 * 
	 * swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
	 * swapEnds([1, 2, 3]) → [3, 2, 1]
	 * swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
	 */

	public static int[] swapEnds(int[] nums) {
		int[] nums1 = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			nums1[i] = nums[i];
			nums1[0] = nums[nums.length - 1];
			nums1[nums1.length - 1] = nums[0];
		}
		return nums1;
	}

}
