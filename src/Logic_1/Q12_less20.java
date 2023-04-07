package Logic_1;

public class Q12_less20 {

	public static void main(String[] args) {
		System.out.println(Q12_less20.less20(58));
	}

	/**
	 * Return true if the given non-negative number is 1 or 2 less than a multiple of 20. 
	 * So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod
	 * 
	 * less20(18) → true
	 * less20(19) → true
	 * less20(20) → false
	 */

	/**TR
	 * Verilen negatif olmayan sayı, 20'nin katından 1 veya 2 daha küçükse true değerini döndürür. 
	 * Örneğin, 38 ve 39 true değerini döndürür, ancak 40 false değerini döndürür.
	 * 
	 * less20(18) → true
	 * less20(19) → true
	 * less20(20) → false
	 */

	public static boolean less20(int n) {
		return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;

	}
}
