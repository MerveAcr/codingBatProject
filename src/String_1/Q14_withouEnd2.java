package String_1;

public class Q14_withouEnd2 {

	public static void main(String[] args) {
		System.out.println(Q14_withouEnd2.withouEnd2("apple"));
	}

	/**
	 * Given a string, return a version without both the first and last char of the string. 
	 * The string may be any length, including 0.
	 * 
	 * withouEnd2("Hello") → "ell"
	 * withouEnd2("abc") → "b"
	 * withouEnd2("ab") → ""
	 */

	/** TR
	 * Bir dize verildiğinde, dizenin  ilk ve son karakteri olmayan bir sürüm döndürün. 
	 * Dize, 0 dahil herhangi bir uzunlukta olabilir.
	 * 
	 * withouEnd2("Hello") → "ell"
	 * withouEnd2("abc") → "b"
	 * withouEnd2("ab") → ""
	 */

	public static String withouEnd2(String str) {
		if (str.length() <= 2)
			return "";
		else
			return str.substring(1, str.length() - 1);
	}
}
