package String_1;

public class Q07_firstHalf {

	public static void main(String[] args) {
		System.out.println(Q07_firstHalf.firstHalf("HelloWorld"));

	}

	/**
	 * Given a string of even length, return the first half. 
	 * So the string "WooHoo" yields "Woo".
	 * 
	 * firstHalf("WooHoo") → "Woo"
	 * firstHalf("HelloThere") → "Hello"
	 * firstHalf("abcdef") → "abc"
	 */

	/** TR
	 * Eşit uzunlukta bir dize verildiğinde, ilk yarıyı döndürün.
	 * Böylece "WooHoo" dizisi "Woo" verir.
	 * 
	 * firstHalf("WooHoo") → "Woo"
	 * firstHalf("HelloThere") → "Hello"
	 * firstHalf("abcdef") → "abc" 
	 */

	public static String firstHalf(String str) {
		if (str.length() % 2 == 0)
			return str.substring(0, str.length() / 2);
		else
			return str;
	}
}
