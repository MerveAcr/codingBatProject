package String_1;

public class Q15_middleTwo {

	public static void main(String[] args) {
		System.out.println(Q15_middleTwo.middleTwo("Practice"));
	}

	/**
	 * Given a string of even length, return a string made of the middle two chars, 
	 * so the string "string" yields "ri". 
	 * The string length will be at least 2.
	 * 
	 * middleTwo("string") → "ri"
	 * middleTwo("code") → "od"
	 * middleTwo("Practice") → "ct"
	 */

	/** TR
	 * Eşit uzunlukta bir dize verildiğinde, ortadaki iki karakterden oluşan bir dize döndürün, 
	 * böylece "string" dizesi "ri" verir. 
	 * Dize uzunluğu en az 2 olacaktır.
	 * 
	 * middleTwo("string") → "ri"
	 * middleTwo("code") → "od"
	 * middleTwo("Practice") → "ct"
	 */

	public static String middleTwo(String str) {
		int half = str.length() / 2;
		if (str.length() % 2 == 0)
			return str.substring(half - 1, half + 1);
		else
			return str;
	}
}
