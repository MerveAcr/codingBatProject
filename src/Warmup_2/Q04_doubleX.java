package Warmup_2;

public class Q04_doubleX {

	public static void main(String[] args) {
		System.out.println(Q04_doubleX.doubleX("aaaax"));
	}

	/**
	 * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
	 * 
	 * doubleX("axxbb") → true
	 * doubleX("axaxax") → false
	 * doubleX("xxxxx") → true
	 */

	/**TR
	 * Bir dize verildiğinde, dizedeki ilk "x" örneğinin hemen ardından başka bir "x" geliyorsa true değerini döndürür.
	 * 
	 * doubleX("axxbb") → true
	 * doubleX("axaxax") → false
	 * doubleX("xxxxx") → true
	 */

	public static boolean doubleX(String str) {
		if (str.contains("x") && str.length() > 1) {
			int i = str.indexOf("x");
			if (str.indexOf("x") == str.length() - 1) {
				return false;
			}
			if (str.substring(i, i + 2).equals("xx")) {
				return true;
			}
		}
		return false;
	}
}
