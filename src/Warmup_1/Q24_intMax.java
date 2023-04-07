package Warmup_1;

public class Q24_intMax {

	public static void main(String[] args) {
		System.out.println(Q24_intMax.intMax(1, 2, 5));

	}

	/**
	 * Given three int values, a b c, return the largest.
	 * 
	 * intMax(1, 2, 3) → 3
	 * intMax(1, 3, 2) → 3
	 * intMax(3, 2, 1) → 3
	 */

	/** TR
	 * Verilen üç int değerinden (a,b,c ), en büyüğünü döndür.
	 * 
	 * intMax(1, 2, 3) → 3
	 * intMax(1, 3, 2) → 3
	 * intMax(3, 2, 1) → 3
	 */

	public static int intMax(int a, int b, int c) {
		if (a > b && a > c)
			return a;
		else if (b > a && b > c)
			return b;
		else
			return c;
	}
}
