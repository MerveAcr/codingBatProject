package Logic_1;

public class Q23_lessBy10 {
	public static void main(String[] args) {
		System.out.println(Q23_lessBy10.lessBy10(3, 3, 30));
	}

	/**
	 * Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
	 * 
	 * lessBy10(1, 7, 11) → true
	 * lessBy10(1, 7, 10) → false
	 * lessBy10(11, 1, 7) → true
	 */

	/**TR
	 * Üç int degeri verildiğinde, a b c, 
	 * bunlardan biri diğerlerinden birinden 10 veya daha fazlaysa true değerini döndürür.
	 * 
	 * lessBy10(1, 7, 11) → true
	 * lessBy10(1, 7, 10) → false
	 * lessBy10(11, 1, 7) → true
	 */

	public static boolean lessBy10(int a, int b, int c) {
		return (Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(a - c) >= 10);
	}
}
