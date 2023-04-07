package Warmup_2;

public class Q01_stringTimes {

	public static void main(String[] args) {
		System.out.println(Q01_stringTimes.stringTimes("code", 5));

	}

	/**
	 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
	 * 
	 * stringTimes("Hi", 2) → "HiHi"
	 * stringTimes("Hi", 3) → "HiHiHi"
	 * stringTimes("Hi", 1) → "Hi"
	 */

	/** TR
	 * Bir dize ve negatif olmayan bir int n verildiğinde, orijinal dizenin n kopyası olan daha büyük bir dize döndürür.
	 * 
	 * stringTimes("Hi", 2) → "HiHi"
	 * stringTimes("Hi", 3) → "HiHiHi"
	 * stringTimes("Hi", 1) → "Hi"
	 */

	public static String stringTimes(String str, int n) {
		String text = "";
		if (n < 1 || str == "") {
			return "";
		} else {
			for (int i = 1; i <= n; i++) {
				text = text + str;
			}
			return text;
		}
	}
}
