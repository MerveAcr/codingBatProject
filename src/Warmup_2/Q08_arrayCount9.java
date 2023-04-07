package Warmup_2;

public class Q08_arrayCount9 {

	public static void main(String[] args) {
		int[] nums = { 1, 9, 9, 3, 9 };
		System.out.println(Q08_arrayCount9.arrayCount9(nums));
	}

	/**
	 * Given an array of ints, return the number of 9's in the array.
	 * 
	 * arrayCount9([1, 2, 9]) → 1
	 * arrayCount9([1, 9, 9]) → 2
	 * arrayCount9([1, 9, 9, 3, 9]) → 3
	 */

	/** TR
	 * Bir dizi ints verildiğinde, dizideki 9'ların kac tane oldugunu yazdirin.
	 * 
	 * arrayCount9([1, 2, 9]) → 1
	 * arrayCount9([1, 9, 9]) → 2
	 * arrayCount9([1, 9, 9, 3, 9]) → 3
	 */

	public static int arrayCount9(int[] nums) {
		int count = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] == 9) {
				count++;
			}
		}
		return count;
	}

}
