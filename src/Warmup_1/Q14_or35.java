package Warmup_1;

public class Q14_or35 {

	public static void main(String[] args) {
		System.out.println(Q14_or35.or35(15));

	}

	/**
	 * Return true if the given non-negative number is a multiple of 3 or a multiple of 5. 
	 * Use the % "mod" operator 
	 * 
	 * or35(3) → true
	 * or35(10) → true
	 * or35(8) → false
	 */

	/** TR
	 * Verilen negatif olmayan sayı 3'ün katı veya 5'in katıysa true değerini döndürün. 
	 * % "mod" operatörünü kullanın
	 * 
	 * or35(3) → true
	 * or35(10) → true
	 * or35(8) → false
	 */

	public static boolean or35(int n) {
		return (n % 3 == 0) || (n % 5 == 0);
	}
}
