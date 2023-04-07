package Array_1;

import java.util.Arrays;

public class Q26_make2 {

	public static void main(String[] args) {
		int a[] = { 4, 5 };
		int b[] = { 1, 2, 3 };
		System.out.println(Arrays.toString(Q26_make2.make2(a, b)));

	}

	/**
	 * Given 2 int arrays, a and b, 
	 * return a new array length 2 containing, as much as will fit, 
	 * the elements from a followed by the elements from b. 
	 * The arrays may be any length, including 0, 
	 * but there will be 2 or more elements available between the 2 arrays.
	 * 
	 * make2([4, 5], [1, 2, 3]) → [4, 5]
	 * make2([4], [1, 2, 3]) → [4, 1]
	 * make2([], [1, 2]) → [1, 2]
	 */

	/**TR
	 * Verilen 2 int dizisi, a ve b, 
	 * uygun olduğu kadar a'dan gelen öğeleri 
	 * ve ardından b'den gelen öğeleri içeren yeni bir dizi uzunluğu 2 döndürür. 
	 * Diziler 0 dahil herhangi bir uzunlukta olabilir, 
	 * ancak 2 dizi arasında 2 veya daha fazla eleman bulunacaktır.
	 * 
	 * make2([4, 5], [1, 2, 3]) → [4, 5]
	 * make2([4], [1, 2, 3]) → [4, 1]
	 * make2([], [1, 2]) → [1, 2]
	 */

	public static int[] make2(int[] a, int[] b) {
		int[] nums = new int[2];
		if (a.length >= 2) {
			nums[0] = a[0];
			nums[1] = a[1];
		} else if (a.length == 1) {
			nums[0] = a[0];
			nums[1] = b[0];
		} else {
			nums[0] = b[0];
			nums[1] = b[1];
		}
		return nums;
	}
}
