package Array_1;

import java.util.Arrays;

public class Q22_midThree {

	public static void main(String[] args) {
		int nums[] = { 8, 6, 7, 5, 3, 0, 9 };
		System.out.println(Arrays.toString(Q22_midThree.midThree(nums)));
	}

	/**
	 * Given an array of ints of odd length, 
	 * return a new array length 3 containing the elements from the middle of the array. 
	 * The array length will be at least 3.
	 * 
	 * midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
	 * midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
	 * midThree([1, 2, 3]) → [1, 2, 3]
	 */

	/**TR
	 * Tek uzunlukta bir dizi verildiğinde, 
	 * dizinin ortasındaki öğeleri içeren yeni bir dizi uzunluğu 3 döndürün. 
	 * Dizi uzunluğu en az 3 olacaktır.
	 * 
	 * midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
	 * midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
	 * midThree([1, 2, 3]) → [1, 2, 3]
	 */

	public static int[] midThree(int[] nums) {
		int[] newNums = new int[3];
		int ortaInt = nums.length / 2;
		newNums[0] = nums[ortaInt - 1];
		newNums[1] = nums[ortaInt];
		newNums[2] = nums[ortaInt + 1];
		return newNums;
	}

}
