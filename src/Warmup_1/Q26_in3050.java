package Warmup_1;

public class Q26_in3050 {

	public static void main(String[] args) {
		System.out.println(Q26_in3050.in3050(30, 32));

	}

	/**
	 * Given 2 int values, return true if they are both in the range 30..40 inclusive, 
	 * or they are both in the range 40..50 inclusive.
	 * 
	 * in3050(30, 31) → true
	 * in3050(30, 41) → false
	 * in3050(40, 50) → true 
	 */

	/** TR
	 * 2 int değeri verildiğinde, her ikisi de 30..40 dahil aralığındaysa 
	 * veya her ikisi de 40..50 dahil aralığındaysa true değerini döndürür.
	 * 
	 * in3050(30, 31) → true
	 * in3050(30, 41) → false
	 * in3050(40, 50) → true 
	 */

	public static boolean in3050(int a, int b) {
		if (a >= 30 && a <= 40 && b >= 30 && b <= 40 || a >= 40 && a <= 50 && b >= 40 && b <= 50)
			return true;
		else
			return false;

	}

}
