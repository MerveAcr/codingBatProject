package Warmup_1;

public class Q12_front3 {

	public static void main(String[] args) {
		System.out.println(Q12_front3.front3("Java"));

	}

	/**
	 * Given a string, we'll say that the front is the first 3 chars of the string. 
	 * If the string length is less than 3, the front is whatever is there. 
	 * Return a new string which is 3 copies of the front.
	 * 
	 * front3("Java") → "JavJavJav"
	 * front3("Chocolate") → "ChoChoCho"
	 * front3("abc") → "abcabcabc"
	 */

	/** TR
	 * Bir dize verildiğinde, dizinin ilk 3 karakterinin ön olduğunu söyleyeceğiz. 
	 * Dize uzunluğu 3'ten küçükse, ön kısım ne varsa odur.
	 * Ön tarafın 3 kopyası olan yeni bir dize döndürün.
	 * 
	 * front3("Java") → "JavJavJav"
	 * front3("Chocolate") → "ChoChoCho"
	 * front3("abc") → "abcabcabc"
	 */

	public static String front3(String str) {
		String front;
		if (str.length() >= 3) {
			front = str.substring(0, 3);
		} else {
			front = str;
		}
		return front + front + front;
	}
}
