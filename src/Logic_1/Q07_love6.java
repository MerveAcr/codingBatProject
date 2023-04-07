package Logic_1;

public class Q07_love6 {

	public static void main(String[] args) {
		System.out.println(Q07_love6.love6(4, 5));

	}

	/**
	 * The number 6 is a truly great number. 
	 * Given two int values, a and b, return true if either one is 6. 
	 * Or if their sum or difference is 6. 
	 * Note: the function Math.abs(num) computes the absolute value of a number.
	 * 
	 * love6(6, 4) → true
	 * love6(4, 5) → false
	 * love6(1, 5) → true
	 */

	/**TR
	 * 6 sayısı gerçekten harika bir sayı. 
	 * İki int değeri (a ve b) verildiğinde, biri 6 ise veya toplamları ya da farkları 6 ise true döndürür. 
	 * Not: Math.abs(num) işlevi bir sayının mutlak değerini hesaplar.
	 * 
	 * love6(6, 4) → true
	 * love6(4, 5) → false
	 * love6(1, 5) → true
	 */

	public static boolean love6(int a, int b) {
		if (a == 6 || b == 6)
			return true;
		if (a + b == 6 || Math.abs(a - b) == 6)
			return true;
		else
			return false;
	}
}
