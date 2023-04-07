package Array_1;

import java.util.Arrays;

public class Q10_middleWay {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		int b[] = { 4, 5, 6 };
		System.out.println(Arrays.toString(Q10_middleWay.middleWay(a, b)));

	}

	/**
	 * Given 2 int arrays, a and b, each length 3, 
	 * return a new array length 2 containing their middle elements.
	 * 
	 * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
	 * middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
	 * middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
	 */

	/**TR
	 * Verilen 2 int dizisi, a ve b, her birinin uzunlugu 3 olmak sarti ile, 
	 * ortadaki öğeleri içeren yeni bir dizi uzunluğu 2 döndürür.
	 * 
	 * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
	 * middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
	 * middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
	 */

	public static int[] middleWay(int[] a, int[] b) {
		int[] nums = new int[2];
		nums[0] = a[1];
		nums[1] = b[1];
		return nums;
	}
}
