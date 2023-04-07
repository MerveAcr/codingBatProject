package Array_1;

public class Q04_commonEnd {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		int b[] = { 7, 3 };
		System.out.println(Q04_commonEnd.commonEnd(a, b));
	}

	/**
	 * Given 2 arrays of ints, a and b, 
	 * return true if they have the same first element or they have the same last element. 
	 * Both arrays will be length 1 or more.
	 * 
	 * commonEnd([1, 2, 3], [7, 3]) → true
	 * commonEnd([1, 2, 3], [7, 3, 2]) → false
	 * commonEnd([1, 2, 3], [1, 3]) → true
	 */
	/**  TR
	 * 2 dizi int degeri verildiginde, 
	 * aynı ilk öğeye sahiplerse veya aynı son öğeye sahiplerse true değerini döndürür. 
	 * Her iki dizi de uzunluk 1 veya daha fazla olacaktır.
	 * 
	 * commonEnd([1, 2, 3], [7, 3]) → true
	 * commonEnd([1, 2, 3], [7, 3, 2]) → false
	 * commonEnd([1, 2, 3], [1, 3]) → true
	 */

	public static boolean commonEnd(int[] a, int[] b) {
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1])
			return true;
		else
			return false;
	}
}
