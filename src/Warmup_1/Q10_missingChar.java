package Warmup_1;

public class Q10_missingChar {

	public static void main(String[] args) {
		System.out.println(Q10_missingChar.missingChar("code", 2));
	}

	/**
	 * Given a non-empty string and an int n, return a new string where the char at index n has been removed. 
	 * The value of n will be a valid index of a char in the original string 
	 * (i.e. n will be in the range 0..str.length()-1 inclusive).
	 * 
	 * missingChar("kitten", 1) → "ktten"
	 * missingChar("kitten", 0) → "itten"
	 * missingChar("kitten", 4) → "kittn"
	 */

	/** TR
	 * Boş olmayan bir dize ve bir int n verildiğinde,
	 * n dizinindeki karakterin kaldırıldığı yeni bir dize döndürün.
	 * n değeri, orijinal dizedeki bir karakterin geçerli bir dizini olacaktır 
	 * (yani n, 0..str.length()-1 dahil aralığında olacaktır).
	 */

	public static String missingChar(String str, int n) {
		String ilk = str.substring(0, n);
		String son = str.substring(n + 1, str.length());
		return ilk + son;

	}
}
