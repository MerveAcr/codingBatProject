package String_1;

public class Q24_lastTwo {

	public static void main(String[] args) {
		System.out.println(Q24_lastTwo.lastTwo("cat"));
	}

	/**
	 * Given a string of any length, return a new string where the last 2 chars, if present, are swapped,
	 * so "coding" yields "codign".
	 * 
	 * lastTwo("coding") → "codign"
	 * lastTwo("cat") → "cta"
	 * lastTwo("ab") → "ba"
	 */

	/**TR
	 * Herhangi bir uzunlukta bir dize verildiğinde, varsa son 2 karakterin değiştirildiği yeni bir dize döndürün, 
	 * böylece "coding" "codign" verir.
	 * 
	 * lastTwo("coding") → "codign"
	 * lastTwo("cat") → "cta"
	 * lastTwo("ab") → "ba"
	 */

	public static String lastTwo(String str) {
		String bos = "";
		if (str.length() >= 2) {
			bos += str.substring(str.length() - 1) + str.substring(str.length() - 2, str.length() - 1);
			return str.substring(0, str.length() - 2) + bos;
		} else {
			return str;
		}
	}
}
