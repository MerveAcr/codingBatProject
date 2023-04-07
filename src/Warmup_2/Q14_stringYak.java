package Warmup_2;

public class Q14_stringYak {

	public static void main(String[] args) {
		System.out.println(Q14_stringYak.stringYak("yakpak"));

	}

	/**
	 * Suppose the string "yak" is unlucky.
	 * Given a string, return a version where all the "yak" are removed, but the "a" can be any char. 
	 * The "yak" strings will not overlap.
	 * 
	 * stringYak("yakpak") → "pak"
	 * stringYak("pakyak") → "pak"
	 * stringYak("yak123ya") → "123ya"
	 * 
	 */

	/**TR
	 * "yak" dizesinin şanssız olduğunu varsayalım. 
	 * Bir dize verildiğinde, tüm "yak" öğelerinin kaldırıldığı bir sürüm döndürün, 
	 * ancak "a" herhangi bir karakter olabilir. "Yak" dizeleri örtüşmez.
	 * 
	 * stringYak("yakpak") → "pak"
	 * stringYak("pakyak") → "pak"
	 * stringYak("yak123ya") → "123ya"
	 */

	public static String stringYak(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
				i = i + 2;
			} else {
				result = result + str.charAt(i);
			}
		}
		return result;

	}
}
