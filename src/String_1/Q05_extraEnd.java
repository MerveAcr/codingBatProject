package String_1;

public class Q05_extraEnd {

	public static void main(String[] args) {
		System.out.println(Q05_extraEnd.extraEnd("Code"));
	}

	/**
	 * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
	 * The string length will be at least 2.
	 *
	 *extraEnd("Hello") → "lololo"
	 *extraEnd("ab") → "ababab"
	 *extraEnd("Hi") → "HiHiHi"
	 */

	/**TR
	 * Bir dize verildiğinde, orijinal dizenin son 2 karakterinin 3 kopyasından oluşan yeni bir dize döndürün. 
	 * Dize uzunluğu en az 2 olacaktır.
	 * 
	 *extraEnd("Hello") → "lololo"
	 *extraEnd("ab") → "ababab"
	 *extraEnd("Hi") → "HiHiHi" 
	 */

	public static String extraEnd(String str) {
		String lastThree = str.substring(str.length() - 2);
		return lastThree + lastThree + lastThree;
	}

}
