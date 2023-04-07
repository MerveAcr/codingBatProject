package String_1;

public class Q23_conCat {

	public static void main(String[] args) {
		System.out.println(Q23_conCat.conCat("dog", "cat"));
	}

	/**
	 * Given two strings, append them together (known as "concatenation") and return the result. 
	 * However, if the concatenation creates a double-char, 
	 * then omit one of the chars, so "abc" and "cat" yields "abcat".
	 * 
	 * conCat("abc", "cat") → "abcat"
	 * conCat("dog", "cat") → "dogcat"
	 * conCat("abc", "") → "abc"
	 */

	/**TR
	 * Verilen iki dize, bunları birbirine ekleyin ("concatenation" olarak bilinir) ve sonucu döndürün. 
	 * Ancak, birleştirme bir çift karakter oluşturuyorsa, 
	 * karakterlerden birini atlayın, bu nedenle "abc" ve "cat", "abcat" sonucunu verir.
	 * 
	 * conCat("abc", "cat") → "abcat"
	 * conCat("dog", "cat") → "dogcat"
	 * conCat("abc", "") → "abc"
	 */

	public static String conCat(String a, String b) {
		if (a.length() > 0 && b.length() > 0) {
			if (a.charAt(a.length() - 1) == b.charAt(0)) {
				return a + b.substring(1);
			} else {
				return a + b;
			}
		} else {
			return a + b;
		}
	}

}
