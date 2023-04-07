package Array_1;

import java.util.Arrays;

public class Q18_biggerTwo {

	public static void main(String[] args) {
		int a[] = { 1, 2 };
		int b[] = { 3, 4 };
		System.out.println(Arrays.toString(Q18_biggerTwo.biggerTwo(a, b)));

	}

	/**
	 * Start with 2 int arrays, a and b, each length 2. 
	 * Consider the sum of the values in each array. 
	 * Return the array which has the largest sum. 
	 * In event of a tie, return a.
	 * 
	 * biggerTwo([1, 2], [3, 4]) → [3, 4]
	 * biggerTwo([3, 4], [1, 2]) → [3, 4]
	 * biggerTwo([1, 1], [1, 2]) → [1, 2]
	 */

	/** TR
	 * Her birinin uzunlugu 2 olan 2 int dizisi, a ve b ile başlayın. 
	 * Her dizideki değerlerin toplamını düşünün. 
	 * En büyük toplamı olan diziyi döndürün. 
	 * Beraberlik durumunda, a döndürün.
	 * 
	 * biggerTwo([1, 2], [3, 4]) → [3, 4]
	 * biggerTwo([3, 4], [1, 2]) → [3, 4]
	 * biggerTwo([1, 1], [1, 2]) → [1, 2]
	 */

	public static int[] biggerTwo(int[] a, int[] b) {
		int aSum = a[0] + a[1];
		int bSum = b[0] + b[1];
		if (aSum > bSum) {
			return a;
		} else if (bSum > aSum) {
			return b;
		} else {
			return a;
		}
	}
}
