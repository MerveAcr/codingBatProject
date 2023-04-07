package Warmup_2;

public class Q05_stringBits {

	public static void main(String[] args) {
		System.out.println(Q05_stringBits.stringBits("Hello"));

	}

	/**
	 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
	 * 
	 * stringBits("Hello") → "Hlo"
	 * stringBits("Hi") → "H"
	 * stringBits("Heeololeo") → "Hello"
	 */

	/** TR
	 * Bir dize verildiğinde, ilkinden başlayarak diğer her karakterden oluşan yeni bir dize döndürün, 
	 * böylece "Hello", "Hlo" verir.
	 * 
	 * stringBits("Hello") → "Hlo"
	 * stringBits("Hi") → "H"
	 * stringBits("Heeololeo") → "Hello"
	 */

	public static String stringBits(String str) {
		String text = "";
		for (int i = 0; i <= str.length() - 1; i += 2) {
			text = text + str.charAt(i);
		}
		return text;

	}
}
