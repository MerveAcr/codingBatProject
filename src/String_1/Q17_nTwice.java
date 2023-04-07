package String_1;

public class Q17_nTwice {

	public static void main(String[] args) {
		System.out.println(Q17_nTwice.nTwice("Chocolate", 4));
	}

	/**
	 * Given a string and an int n, return a string made of the first and last n chars from the string. 
	 * The string length will be at least n.
	 * 
	 *nTwice("Hello", 2) → "Helo"
	 *nTwice("Chocolate", 3) → "Choate"
	 *nTwice("Chocolate", 1) → "Ce"
	 */

	/**TR
	 * Bir dize ve bir int 'n' degeri verildiğinde, dizeden ilk ve son n karakterden oluşan bir dize döndürür. 
	 * Dize uzunluğu en az n olacaktır.
	 * 
	 *nTwice("Hello", 2) → "Helo"
	 *nTwice("Chocolate", 3) → "Choate"
	 *nTwice("Chocolate", 1) → "Ce"
	 */

	public static String nTwice(String str, int n) {
		String first = str.substring(0, n);
		String last = str.substring(str.length() - n);
		return first + last;
	}
}
