package Array_1;

import java.util.Arrays;

public class Q06_rotateLeft3 {

	public static void main(String[] args) {
		int nums[] = { 5, 11, 9 };
		System.out.println(Arrays.toString(Q06_rotateLeft3.rotateLeft3(nums)));
	}

	/**
	 * Given an array of ints length 3,
	 * return an array with the elements "rotated left" 
	 * so {1, 2, 3} yields {2, 3, 1}.
	 * 
	 * rotateLeft3([1, 2, 3]) → [2, 3, 1]
	 * rotateLeft3([5, 11, 9]) → [11, 9, 5]
	 * rotateLeft3([7, 0, 0]) → [0, 0, 7]
	 */

	/**TR
	 * Uzunluğu 3 olan bir dizi verildiğinde, 
	 * "sola döndürülmüş" öğeleri içeren bir dizi döndürün, 
	 * böylece {1, 2, 3} {2, 3, 1} sonucunu verir.
	 */

	public static int[] rotateLeft3(int[] nums) {
		return new int[] { nums[1], nums[2], nums[0] };
	}

}
