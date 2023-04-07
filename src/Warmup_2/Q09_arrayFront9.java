package Warmup_2;

public class Q09_arrayFront9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Given an array of ints, return true if one of the first 4 elements in the array is a 9. 
	 * The array length may be less than 4.
	 * 
	 * arrayFront9([1, 2, 9, 3, 4]) → true
	 * arrayFront9([1, 2, 3, 4, 9]) → false
	 * arrayFront9([1, 2, 3, 4, 5]) → false
	 */

	/** TR
	 * Bir int dizisi verildiğinde, dizideki ilk 4 öğeden biri 9 ise true değerini döndürür. 
	 * Dizi uzunluğu 4'ten az olabilir.
	 * 
	 * arrayFront9([1, 2, 9, 3, 4]) → true
	 * arrayFront9([1, 2, 3, 4, 9]) → false
	 * arrayFront9([1, 2, 3, 4, 5]) → false
	 */

	public static boolean arrayFront9(int[] nums) {
		int end = nums.length;
		if (end > 4) {
			end = 4;
		}
		for (int i = 0; i < end; i++) {
			if (nums[i] == 9)
				return true;
		}
		return false;
	}

}
