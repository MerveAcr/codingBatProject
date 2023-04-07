package Warmup_1;

public class Q19_hasTeen {

	public static void main(String[] args) {
		System.out.println(Q19_hasTeen.hasTeen(13, 20, 10));
	}

	/**
	 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
	 * Given 3 int values, return true if 1 or more of them are teen.
	 * 
	 * hasTeen(13, 20, 10) → true
	 * hasTeen(20, 19, 10) → true
	 * hasTeen(20, 10, 13) → true
	 */

	/** TR 
	 * Verilen sayi 13..19 dahil aralığındaysa o sayının "teen" olduğunu söyleyeceğiz.
	 * 3 int değeri verildiğinde, 1 veya daha fazlası teen ise true değerini döndürün.
	 * hasTeen(13, 20, 10) → true
	 * hasTeen(20, 19, 10) → true
	 * hasTeen(20, 10, 13) → true 
	 */

	public static boolean hasTeen(int a, int b, int c) {
		if (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19) {
			return true;
		}
		return false;
	}
}
