package Warmup_1;

public class Q11_frontBack {

	public static void main(String[] args) {
		System.out.println(Q11_frontBack.frontBack("Chocolate"));

	}

	/**
	 * Given a string, return a new string where the first and last chars have been exchanged.
	 * 
	 * frontBack("code") → "eodc"
	 * frontBack("a") → "a"
	 * frontBack("ab") → "ba"
	 */

	/** TR
	 * Bir dize verildiğinde, ilk ve son karakterlerin değiştirildiği yeni bir dize döndürün.
	 * 
	 * frontBack("code") → "eodc"
	 * frontBack("a") → "a"
	 * frontBack("ab") → "ba"
	 */

	public static String frontBack(String str) {
		if (str.length() <= 1)
			return str;
		char ilk = str.charAt(0);
		char son = str.charAt(str.length() - 1);
		String orta = str.substring(1, str.length() - 1);
		return son + orta + ilk;
	}
}
