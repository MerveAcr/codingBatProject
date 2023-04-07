package Array_1;

import java.util.Arrays;

public class Q07_reverse3 {

	public static void main(String[] args) {
		int nums[] = { 5, 11, 9 };
		System.out.println(Arrays.toString(Q07_reverse3.reverse3(nums)));

	}

	/**
	 * Given an array of ints length 3, 
	 * return a new array with the elements in reverse order, 
	 * so {1, 2, 3} becomes {3, 2, 1}.
	 * 
	 * reverse3([1, 2, 3]) → [3, 2, 1]
	 * reverse3([5, 11, 9]) → [9, 11, 5]
	 * reverse3([7, 0, 0]) → [0, 0, 7]
	 */

	/** TR
	 * Uzunluğu 3 olan bir dizi verildiğinde, 
	 * elemanları ters sırada olacak şekilde yeni bir dizi döndürün, 
	 * böylece {1, 2, 3} {3, 2, 1} olur.
	 * 
	 * reverse3([1, 2, 3]) → [3, 2, 1]
	 * reverse3([5, 11, 9]) → [9, 11, 5]
	 * reverse3([7, 0, 0]) → [0, 0, 7]
	 */

	public static int[] reverse3(int[] nums) {
		int[] reserve = new int[3];
		int k = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			reserve[k] = nums[i];
			k++;
		}
		return reserve;
	}
}
