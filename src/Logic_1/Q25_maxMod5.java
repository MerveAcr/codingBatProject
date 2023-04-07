package Logic_1;

public class Q25_maxMod5 {
	public static void main(String[] args) {
		System.out.println(Q25_maxMod5.maxMod5(6, 2));
	}

	/**
	 * Given two int values, return whichever value is larger. 
	 * However if the two values have the same remainder when divided by 5, 
	 * then the return the smaller value. 
	 * However, in all cases, if the two values are the same, return 0. 
	 * Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
	 * 
	 * maxMod5(2, 3) → 3
	 * maxMod5(6, 2) → 6
	 * maxMod5(3, 2) → 3
	 */

	/**TR
	 * İki int değeri verildiğinde, hangisi daha büyükse onu döndürür. 
	 * Bununla birlikte, iki değer 5'e bölündüğünde aynı kalana sahipse, daha küçük değeri döndürür. 
	 * Ancak, her durumda, iki değer aynıysa, 0 döndürür. 
	 * Not: % "mod" operatörü kalanı hesaplar, örneğin %7 5, 2'dir.
	 * 
	 * maxMod5(2, 3) → 3
	 * maxMod5(6, 2) → 6
	 * maxMod5(3, 2) → 3
	 */

	public static int maxMod5(int a, int b) {
		if (a == b)
			return 0;
		if (a % 5 == b % 5)
			return Math.min(a, b);

		return Math.max(a, b);
	}
}
