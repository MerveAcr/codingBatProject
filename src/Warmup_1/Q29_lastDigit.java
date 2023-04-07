package Warmup_1;

public class Q29_lastDigit {

	public static void main(String[] args) {
		System.out.println(Q29_lastDigit.lastDigit(6, 16));

	}

	/**
	 * Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. 
	 * Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
	 * 
	 * lastDigit(7, 17) → true
	 * lastDigit(6, 17) → false
	 * lastDigit(3, 113) → true
	 */

	/** TR
	 * Negatif olmayan iki int değeri verildiğinde, 27 ve 57 gibi aynı son basamağa sahiplerse true değerini döndürür.
	 * % "mod" operatörünün kalanları hesapladığını unutmayın, bu nedenle 17 % 10, 7'dir.
	 * 
	 * lastDigit(7, 17) → true
	 * lastDigit(6, 17) → false
	 * lastDigit(3, 113) → true
	 */

	public static boolean lastDigit(int a, int b) {
		if (a % 10 == b % 10)
			return true;
		else
			return false;
	}
}
