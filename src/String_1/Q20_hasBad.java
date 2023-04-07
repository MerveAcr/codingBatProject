package String_1;

public class Q20_hasBad {

	public static void main(String[] args) {
		System.out.println(Q20_hasBad.hasBad("badxxx"));
	}

	/**
	 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
	 * such as with "badxxx" or "xbadxx" but not "xxbadxx". 
	 * The string may be any length, including 0. 
	 * Note: use .equals() to compare 2 strings.
	 * 
	 * hasBad("badxx") → true
	 * hasBad("xbadxx") → true
	 * hasBad("xxbadxx") → false
	 */

	/**TR
	 * Bir dize verildiğinde, dizede 0 veya 1 dizininden başlayarak "bad" görünüyorsa true değerini döndürün. 
	 * "badxxx" veya "xbadxx" gibi, ancak "xxbadxx" değil, 
	 * Dize, 0 dahil herhangi bir uzunlukta olabilir. 
	 * Not: 2 dizeyi karşılaştırmak için .equals() kullanın.
	 * 
	 * hasBad("badxx") → true
	 * hasBad("xbadxx") → true
	 * hasBad("xxbadxx") → false
	 */

	public static boolean hasBad(String str) {
		if (str.length() <= 3 && !str.equals("bad"))
			return false;
		if (str.substring(0, 3).equals("bad"))
			return true;
		else if (str.substring(1, 4).equals("bad"))
			return true;
		else
			return false;
	}
}
