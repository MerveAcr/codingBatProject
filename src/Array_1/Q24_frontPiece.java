package Array_1;

import java.util.Arrays;

public class Q24_frontPiece {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3 };
		System.out.println(Arrays.toString(Q24_frontPiece.frontPiece(nums)));

	}

	/**
	 * Given an int array of any length, return a new array of its first 2 elements. 
	 * If the array is smaller than length 2, use whatever elements are present.
	 * 
	 * frontPiece([1, 2, 3]) → [1, 2]
	 * frontPiece([1, 2]) → [1, 2]
	 * frontPiece([1]) → [1]
	 */

	/** TR
	 * Herhangi bir uzunlukta bir int dizisi verildiğinde,ilk 2 öğesinden oluşan yeni bir dizi döndürün. 
	 * Dizi uzunluk 2'den küçükse, mevcut olan öğeleri kullanın.
	 * 
	 * frontPiece([1, 2, 3]) → [1, 2]
	 * frontPiece([1, 2]) → [1, 2]
	 * frontPiece([1]) → [1]
	 */

	public static int[] frontPiece(int[] nums) {
		int[] nums1 = new int[2];
		if (nums.length >= 2) {
			nums1[0] = nums[0];
			nums1[1] = nums[1];
			return nums1;
		} else {
			return nums;
		}
	}
}
