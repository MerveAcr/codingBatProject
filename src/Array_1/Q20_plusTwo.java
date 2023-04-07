package Array_1;

import java.util.Arrays;

public class Q20_plusTwo {

	public static void main(String[] args) {
		int a[] = { 1, 2 };
		int b[] = { 3, 4 };
		System.out.println(Arrays.toString(Q20_plusTwo.plusTwo(a, b)));
	}

	/**
	 * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
	 * 
	 * plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
	 * plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
	 * plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
	 */

	/** TR
	 * Verilen 2 int dizisi, her biri 2 uzunluk, tüm öğelerini içeren yeni bir dizi uzunluğu 4 döndürür.
	 * 
	 * plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
	 * plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
	 * plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
	 */

	public static int[] plusTwo(int[] a, int[] b) {
		int[] nums = new int[4];
		nums[0] = a[0];
		nums[1] = a[1];
		nums[2] = b[0];
		nums[3] = b[1];
		return nums;
	}
}
