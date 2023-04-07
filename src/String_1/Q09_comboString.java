package String_1;

public class Q09_comboString {

	public static void main(String[] args) {
		System.out.println(Q09_comboString.comboString("aaa", "bbb"));
	}

	/**
	 * Given 2 strings, a and b, return a string of the form short+long+short, 
	 * with the shorter string on the outside and the longer string on the inside. 
	 * The strings will not be the same length, but they may be empty (length 0).
	 *
	 *comboString("Hello", "hi") → "hiHellohi"
	 *comboString("hi", "Hello") → "hiHellohi"
	 *comboString("aaa", "b") → "baaab" 
	 */

	/** TR
	 * Verilen 2 dize, a ve b, 
	 * kısa dize dışarıda ve daha uzun dize içeride olacak şekilde kısa+uzun+kısa biçiminde bir dize döndürür. 
	 * Dizeler aynı uzunlukta olmayacak, ancak boş olabilirler (length 0).
	 * 
	 *comboString("Hello", "hi") → "hiHellohi"
	 *comboString("hi", "Hello") → "hiHellohi"
	 *comboString("aaa", "b") → "baaab" 
	 */

	public static String comboString(String a, String b) {
		if (a.length() < b.length())
			return a + b + a;
		else
			return b + a + b;
	}
}
