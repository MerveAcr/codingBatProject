package Warmup_1;

public class Q27_max1020 {

	public static void main(String[] args) {
		System.out.println(Q27_max1020.max1020(9, 11));

	}

	/**
	 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
	 * 
	 * max1020(11, 19) → 19
	 * max1020(19, 11) → 19
	 * max1020(11, 9) → 11
	 */

	/** TR
	 * 2 pozitif int değeri verildiğinde, 10..20 dahil aralığındaki daha büyük değeri döndürün veya hiçbiri bu aralıkta değilse 0 döndürün.
	 * 
	 * max1020(11, 19) → 19
	 * max1020(19, 11) → 19
	 * max1020(11, 9) → 11
	 */

	public static int max1020(int a, int b) {
		if (a >= 10 && a <= 20 || b >= 10 && b <= 20) {
			if (a > b) {
				return a;
			} else {
				return b;
			}
		} else {
			return 0;
		}
	}
}
