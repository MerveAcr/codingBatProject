package Logic_1;

public class Q08_in1To10 {

	public static void main(String[] args) {
		System.out.println(Q08_in1To10.in1To10(11, true));
	}

	/**
	 * Given a number n, return true if n is in the range 1..10, inclusive. 
	 * Unless outsideMode is true, 
	 * in which case return true if the number is less or equal to 1, or greater or equal to 10.
	 * 
	 * in1To10(5, false) → true
	 * in1To10(11, false) → false
	 * in1To10(11, true) → true
	 */

	/** TR
	 * Bir n sayısı verildiğinde, n, dahil olmak üzere 1..10 aralığındaysa true değerini döndürün. 
	 * outsideMode true olmadığı sürece, 
	 * bu durumda sayı 1'e eşit veya daha küçük veya 10'a eşit veya daha büyükse true değerini döndürür.
	 * 
	 * in1To10(5, false) → true
	 * in1To10(11, false) → false
	 * in1To10(11, true) → true
	 */

	public static boolean in1To10(int n, boolean outsideMode) {
		if (!outsideMode && n >= 1 && n <= 10)
			return true;
		else if (outsideMode && (n <= 1 || n >= 10))
			return true;
		else
			return false;
	}
}
