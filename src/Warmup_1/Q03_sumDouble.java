package Warmup_1;

public class Q03_sumDouble {

	public static void main(String[] args) {
		System.out.println(Q03_sumDouble.sumDouble(3, 5));

	}

	/**
	 * Given two int values, return their sum. 
	 * Unless the two values are the same, then return double their sum.
	 * Example:
	 * sumDouble(1, 2) → 3
	 * sumDouble(3, 2) → 5
	 * sumDouble(2, 2) → 8
	 */

	/** TR
	 * İki int değeri verildiğinde, toplamlarını döndürün. 
	 * İki değer aynı olmadığı sürece, toplamlarının iki katını döndürün.
	 * Ornek:
	 * sumDouble(1, 2) → 3
	 * sumDouble(3, 2) → 5
	 * sumDouble(2, 2) → 8
	 */

	public static int sumDouble(int a, int b) {
		int sum = a + b; // Store the sum in a local variable // Toplam yerel bir degiskende saklanir
		if (a == b) {
			return sum * 2; // Double it if a and b are the same // a ve be ayni degere sahipse toplam 2 ile carpilir
		} else {
			return sum;
		}
	}
}
