package Array_1;

public class Q17_start1 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 3 };
		System.out.println(Q17_start1.start1(a, b));

	}

	/**
	 * Start with 2 int arrays, a and b, of any length. 
	 * Return how many of the arrays have 1 as their first element.
	 * 
	 * start1([1, 2, 3], [1, 3]) → 2
	 * start1([7, 2, 3], [1]) → 1
	 * start1([1, 2], []) → 1
	 */

	/**TR
	 * Herhangi bir uzunlukta 2 int dizisi, a ve b ile başlayın. 
	 * Dizilerden kaçının ilk elemanı olarak 1 olduğunu döndürün.
	 * 
	 * start1([1, 2, 3], [1, 3]) → 2
	 * start1([7, 2, 3], [1]) → 1
	 * start1([1, 2], []) → 1
	 */

	public static int start1(int[] a, int[] b) {
		int k = 0;
		if (a.length != 0) {
			if (a[0] == 1) {
				k++;
			}
		}
		if (b.length != 0) {
			if (b[0] == 1) {
				k++;
			}
		}
		return k;
	}
}
