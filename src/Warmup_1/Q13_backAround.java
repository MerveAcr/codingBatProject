package Warmup_1;

public class Q13_backAround {

	public static void main(String[] args) {
		System.out.println(Q13_backAround.backAround("read"));

	}

	/**
	 * Given a string, 
	 * take the last char and return a new string with the last char added at the front and back, 
	 * so "cat" yields "tcatt". The original string will be length 1 or more.
	 * 
	 * backAround("cat") → "tcatt"
	 * backAround("Hello") → "oHelloo"
	 * backAround("a") → "aaa"
	 */

	/** TR 
	 * Bir dize verildiğinde, 
	 * son karakteri alın ve en basina ve en arkasina eklenen son karakterle yeni bir dize döndürün, 
	 * böylece "cat" "tcatt" verir. 
	 * Orijinal dize uzunluk 1 veya daha fazla olacaktır.
	 * 
	 * backAround("cat") → "tcatt"
	 * backAround("Hello") → "oHelloo"
	 * backAround("a") → "aaa"
	 */

	public static String backAround(String str) {
		// Get the last char
		String last = str.substring(str.length() - 1);
		return last + str + last;
	}

}
