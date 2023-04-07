package Array_1;

import java.util.Arrays;

public class Q19_makeMiddle {

	public static void main(String[] args) {
		int nums[] = { 7, 1, 2, 3, 4, 9 };
		System.out.println(Arrays.toString(Q19_makeMiddle.makeMiddle(nums)));
	}

	/**
	 * Given an array of ints of even length, 
	 * return a new array length 2 containing the middle two elements from the original array. 
	 * The original array will be length 2 or more.
	 * 
	 * makeMiddle([1, 2, 3, 4]) → [2, 3]
	 * makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
	 * makeMiddle([1, 2]) → [1, 2]
	 */

	/**TR
	 * Çift uzunlukta bir dizi verildiğinde, 
	 * orijinal diziden ortadaki iki öğeyi içeren yeni bir dizi uzunluğu 2 döndürün. 
	 * Orijinal dizi uzunluk 2 veya daha fazla olacaktır.
	 * 
	 * makeMiddle([1, 2, 3, 4]) → [2, 3]
	 * makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
	 * makeMiddle([1, 2]) → [1, 2]
	 */

	public static int[] makeMiddle(int[] nums) {
		int[] nums1 = new int[2];
		int middle = nums.length / 2;
		nums1[0] = nums[middle - 1];
		nums1[1] = nums[middle];
		return nums1;
	}

}
