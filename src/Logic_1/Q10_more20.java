package Logic_1;

public class Q10_more20 {

	public static void main(String[] args) {
		System.out.println(Q10_more20.more20(61));
	}

	/**
	 * Return true if the given non-negative number is 1 or 2 more than a multiple of 20. 
	 * See also: Introduction to Mod
	 * 
	 * more20(20) → false
	 * more20(21) → true
	 * more20(22) → true
	 */

	/** TR
	 * Verilen negatif olmayan sayı 20'nin katından 1 veya 2 fazlaysa true değerini döndürün. 
	 * 
	 * more20(20) → false
	 * more20(21) → true
	 * more20(22) → true
	 */

	public static boolean more20(int n) {
		if (n % 20 == 1 || n % 20 == 2)
			return true;
		else
			return false;
	}
}
