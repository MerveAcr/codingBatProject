package Array_1;

import java.util.Arrays;

public class Q14_makeLast {

	public static void main(String[] args) {
		int nums[] = { 4, 5, 6 };
		System.out.println(Arrays.toString(Q14_makeLast.makeLast(nums)));

	}

	/**
	 * Given an int array, 
	 * return a new array with double the length where its last element is the same as the original array, 
	 * and all the other elements are 0. 
	 * The original array will be length 1 or more. 
	 * Note: by default, a new int array contains all 0's.
	 * 
	 * makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
	 * makeLast([1, 2]) → [0, 0, 0, 2]
	 * makeLast([3]) → [0, 3]
	 */

	/** TR
	 * Bir int dizisi verildiğinde, 
	 * son öğesinin orijinal diziyle aynı olduğu 
	 * ve diğer tüm öğelerin 0 olduğu iki katı uzunlukta yeni bir dizi döndürün. 
	 * Orijinal dizinin uzunluğu 1 veya daha fazla olacaktır. 
	 * Not: varsayılan olarak, yeni bir int dizisi tüm 0'ları içerir.
	 * 
	 * makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
	 * makeLast([1, 2]) → [0, 0, 0, 2]
	 * makeLast([3]) → [0, 3]
	 */

	public static int[] makeLast(int[] nums) {
		int[] nums1 = new int[nums.length * 2];
		for (int i = 0; i < nums1.length - 2; i++) {
			nums1[i] = 0;

		}
		nums1[nums1.length - 1] = nums[nums.length - 1];
		return nums1;

	}

}
