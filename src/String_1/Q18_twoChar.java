package String_1;

public class Q18_twoChar {

	public static void main(String[] args) {
		System.out.println(Q18_twoChar.twoChar("java", 3));
	}

	/**
	 * Given a string and an index, return a string length 2 starting at the given index. 
	 * If the index is too big or too small to define a string length 2, use the first 2 chars. 
	 * The string length will be at least 2.
	 * 
	 * twoChar("java", 0) → "ja"
	 * twoChar("java", 2) → "va"
	 * twoChar("java", 3) → "ja"
	 */

	/**TR
	 * Bir dize ve bir int degeri verildiğinde, verilen int degerinden başlayarak 2 karakterden olusan bir dize  döndürün. 
	 * int degerinin uzunluğu 2'yi tanımlamak için çok büyük veya çok küçükse, ilk 2 karakteri kullanın. 
	 * Dize uzunluğu en az 2 olacaktır.
	 * 
	 * twoChar("java", 0) → "ja"
	 * twoChar("java", 2) → "va"
	 * twoChar("java", 3) → "ja"
	 */

	public static String twoChar(String str, int index) {
		if (index >= str.length() - 1 || index < 0)
			return str.substring(0, 2);
		else
			return str.substring(index, (index + 2));
	}
}
