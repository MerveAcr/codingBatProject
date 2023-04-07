package Warmup_1;

public class Q18_in1020 {

	public static void main(String[] args) {
		System.out.println(Q18_in1020.in1020(21, 30));

	}

	/**
	 * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
	 * in1020(12, 99) → true
	 * in1020(21, 12) → true
	 * in1020(8, 99) → false
	 */

	/** TR
	 * 2 int değeri verildiğinde, bunlardan herhangi biri 10..20 aralığındaysa true değerini döndürür.
	 * 
	 * in1020(12, 99) → true
	 * in1020(21, 12) → true
	 * in1020(8, 99) → false
	 */

	public static boolean in1020(int a, int b) {
		return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);

	}
}
