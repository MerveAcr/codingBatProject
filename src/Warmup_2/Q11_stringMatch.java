package Warmup_2;

public class Q11_stringMatch {

	public static void main(String[] args) {
		System.out.println(Q11_stringMatch.stringMatch("hello", "he"));
	}

	/**
	 * Given 2 strings, a and b,
	 * return the number of the positions where they contain the same length 2 substring. 
	 * So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
	 * 
	 * stringMatch("xxcaazz", "xxbaaz") → 3
	 * stringMatch("abc", "abc") → 2
	 * stringMatch("abc", "axc") → 0
	 */

	/** TR
	 * Verilen 2 dize, a ve b,
	 * aynı uzunlukta 2 alt dizeyi içerdikleri konumların sayısını döndürür.
	 * Yani "xxcaazz" ve "xxbaaz" 3 verir, çünkü "xx", "aa" ve "az" alt dizeleri her iki dizede de aynı yerde görünür.
	 * 
	 * stringMatch("xxcaazz", "xxbaaz") → 3
	 * stringMatch("abc", "abc") → 2
	 * stringMatch("abc", "axc") → 0
	 */

	public static int stringMatch(String a, String b) {
		int len = Math.min(a.length(), b.length()); // Figure which string is shorter. // hangi dizenin dha kisa oldugu bulunur
		int count = 0;
		for (int i = 0; i < len - 1; i++) {
			String aSub = a.substring(i, i + 2);
			String bSub = b.substring(i, i + 2);
			if (aSub.equals(bSub)) {
				count++;
			}
		}
		return count;
	}
}
