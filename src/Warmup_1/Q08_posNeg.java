package Warmup_1;

public class Q08_posNeg {

	public static void main(String[] args) {
		System.out.println(Q08_posNeg.posNeg(6, -6, false));

	}

	/**
	 * Given 2 int values, return true if one is negative and one is positive. 
	 * Except if the parameter "negative" is true, then return true only if both are negative.
	 * 
	 * posNeg(1, -1, false) → true
	 * posNeg(-1, 1, false) → true
	 * posNeg(-4, -5, true) → true
	 */

	/** TR
	 * 2 int değeri verildiğinde, biri negatif, diğeri pozitifse true değerini döndürür. 
	 * "Negatif" parametresinin doğru olması dışında, yalnızca her ikisi de negatifse true değerini döndürün.
	 * 
	 * posNeg(1, -1, false) → true
	 * posNeg(-1, 1, false) → true
	 * posNeg(-4, -5, true) → true
	 */

	public static boolean posNeg(int a, int b, boolean negative) {
		if (a < 0 && b > 0 && !negative || a > 0 && b < 0 && !negative) {
			return true;
		} else if (a < 0 && b < 0 && negative) {
			return true;
		} else {
			return false;
		}
	}
}
