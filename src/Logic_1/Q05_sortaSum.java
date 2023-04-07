package Logic_1;

public class Q05_sortaSum {

	public static void main(String[] args) {
		System.out.println(Q05_sortaSum.sortaSum(10, 11));
	}

	/**
	 * Given 2 ints, a and b, return their sum. 
	 * However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
	 * 
	 * sortaSum(3, 4) → 7
	 * sortaSum(9, 4) → 20
	 * sortaSum(10, 11) → 21
	 */

	/** TR
	 * Verilen 2 int, a ve b, toplamlarını döndürür. 
	 * Ancak, 10..19 dahil aralığındaki toplamlar yasaktır, bu durumda sadece 20 döndürün.
	 * 
	 * sortaSum(3, 4) → 7
	 * sortaSum(9, 4) → 20
	 * sortaSum(10, 11) → 21
	 */

	public static int sortaSum(int a, int b) {
		if (a + b >= 10 && a + b <= 19)
			return 20;
		else
			return a + b;
	}
}
