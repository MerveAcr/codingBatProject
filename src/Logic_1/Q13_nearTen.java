package Logic_1;

public class Q13_nearTen {

	public static void main(String[] args) {
		System.out.println(Q13_nearTen.nearTen(6));
	}

	/**
	 * Given a non-negative number "num", return true if num is within 2 of a multiple of 10. 
	 * Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
	 * 
	 * nearTen(12) → true
	 * nearTen(17) → false
	 * nearTen(19) → true
	 */

	/**TR
	 * Negatif olmayan bir sayı "sayı" verildiğinde, sayı 10'un katının 2'si içindeyse true döndürür.
	 * Not: (a % b) a'yı b'ye bölmenin geri kalanıdır, yani (7 % 5) 2'dir
	 * 
	 * nearTen(12) → true
	 * nearTen(17) → false
	 * nearTen(19) → true
	 */

	public static boolean nearTen(int num) {
		if (num % 10 == 2 || num % 10 == 1 || num % 10 == 9 || num % 10 == 8 || num % 10 == 0)
			return true;
		else
			return false;
	}
}
