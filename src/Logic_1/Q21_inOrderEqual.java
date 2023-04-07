package Logic_1;

public class Q21_inOrderEqual {

	public static void main(String[] args) {
		System.out.println(Q21_inOrderEqual.inOrderEqual(5, 5, 7, false));
	}

	/**
	 * Given three ints, a b c, return true if they are in strict increasing order, 
	 * such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. 
	 * However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.
	 * 
	 * inOrderEqual(2, 5, 11, false) → true
	 * inOrderEqual(5, 7, 6, false) → false
	 * inOrderEqual(5, 5, 7, true) → true
	 */

	/**TR
	 * Üç giriş verildiğinde, abc, 2 5 11 veya 5 6 7 gibi katı bir artan sıradaysa true döndürür, 
	 * ancak 6 5 7 veya 5 5 7 değil. 
	 * Ancak, "equalOk" doğruysa, 5 5 7 veya 5 5 5 gibi eşitliğe izin verilir.
	 * 
	 * inOrderEqual(2, 5, 11, false) → true
	 * inOrderEqual(5, 7, 6, false) → false
	 * inOrderEqual(5, 5, 7, true) → true
	 */

	public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if (!equalOk && a < b && b < c)
			return true;
		if (equalOk && a <= b && b <= c)
			return true;
		else
			return false;
	}
}
