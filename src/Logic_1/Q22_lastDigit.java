package Logic_1;

public class Q22_lastDigit {
	public static void main(String[] args) {
		System.out.println(Q22_lastDigit.lastDigit(23, 19, 3));
	}

	/**
	 * Given three ints, a b c, return true if two or more of them have the same rightmost digit. 
	 * The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
	 * 
	 * lastDigit(23, 19, 13) → true
	 * lastDigit(23, 19, 12) → false
	 * lastDigit(23, 19, 3) → true
	 */

	/** TR
	 * Üç int degeri verildiğinde, iki veya daha fazlası aynı en sağdaki basamağa sahipse true değerini döndürür. 
	 * İnt'ler negatif değil. 
	 * Not: % "mod" operatörü kalanı hesaplar, ör. 17 % 10, 7'dir.
	 * 
	 * lastDigit(23, 19, 13) → true
	 * lastDigit(23, 19, 12) → false
	 * lastDigit(23, 19, 3) → true
	 */

	public static boolean lastDigit(int a, int b, int c) {
		int modA = a % 10;
		int modB = b % 10;
		int modC = c % 10;
		if (modA == modB || modA == modC || modB == modC)
			return true;
		else
			return false;
	}
}
