package Warmup_2;

public class Q06_stringSplosion {

	public static void main(String[] args) {
		System.out.println(Q06_stringSplosion.stringSplosion("Good"));

	}

	/**
	 * Given a non-empty string like "Code" return a string like "CCoCodCode".
	 * 
	 * stringSplosion("Code") → "CCoCodCode"
	 * stringSplosion("abc") → "aababc"
	 * stringSplosion("ab") → "aab"
	 */

	/** TR
	 * "Cod" gibi boş olmayan bir dize verildiğinde "CCoCodCode" gibi bir dize döndürür.
	 * 
	 * stringSplosion("Code") → "CCoCodCode"
	 * stringSplosion("abc") → "aababc"
	 * stringSplosion("ab") → "aab"
	 */

	public static String stringSplosion(String str) {
		String text = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			text += str.substring(0, i + 1);
		}
		return text;
	}
}
