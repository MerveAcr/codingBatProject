package Warmup_2;

public class Q12_stringX {

	public static void main(String[] args) {
		System.out.println(Q12_stringX.stringX("Hello"));
	}

	/**
	 * Given a string, return a version where all the "x" have been removed. 
	 * Except an "x" at the very start or end should not be removed.
	 * 
	 * stringX("xxHxix") → "xHix"
	 * stringX("abxxxcd") → "abcd"
	 * stringX("xabxxxcdx") → "xabcdx"
	 */

	/** TR
	 * Bir dize verildiğinde, tüm "x"lerin kaldırıldığı bir sürüm döndürün. 
	 * En baştaki veya sonundaki "x" kaldırılmamalıdır.
	 * 
	 * stringX("xxHxix") → "xHix"
	 * stringX("abxxxcd") → "abcd"
	 * stringX("xabxxxcdx") → "xabcdx"
	 */

	public static String stringX(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			// Only append the char if it is not the "x" case
			if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
				result = result + str.substring(i, i + 1); // Could use str.charAt(i) here
			}
		}
		return result;
	}
}
