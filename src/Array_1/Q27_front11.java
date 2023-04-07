package Array_1;

import java.util.Arrays;

public class Q27_front11 {

	public static void main(String[] args) {
		int a[] = { 3 };
		int b[] = { 1, 4, 1, 9 };
		System.out.println(Arrays.toString(Q27_front11.front11(a, b)));

	}

	/**
	 * Given 2 int arrays, a and b, of any length, 
	 * return a new array with the first element of each array. 
	 * If either array is length 0, ignore that array.
	 * 
	 * front11([1, 2, 3], [7, 9, 8]) → [1, 7]
	 * front11([1], [2]) → [1, 2]
	 * front11([1, 7], []) → [1]
	 */

	/** TR
	 * Herhangi bir uzunlukta 2 int dizisi (a ve b) verildiğinde, 
	 * her dizinin ilk öğesiyle yeni bir dizi döndürür. 
	 * Her iki dizi de 0 uzunluğundaysa, o diziyi yoksayın.
	 * 
	 * front11([1, 2, 3], [7, 9, 8]) → [1, 7]
	 * front11([1], [2]) → [1, 2]
	 * front11([1, 7], []) → [1] 
	 */

	public static int[] front11(int[] a, int[] b) {
		int[] oneArray = new int[1];
		int[] array = new int[2];
		if (a.length == 0 && b.length == 0) {
			return a;
		}
		if (a.length == 0) {
			oneArray[0] = b[0];
			return oneArray;
		} else if (b.length == 0) {
			oneArray[0] = a[0];
			return oneArray;
		} else {
			array[0] = a[0];
			array[1] = b[0];
			return array;
		}
	}
}
