package String_1;

public class Q32_withoutX {

	public static void main(String[] args) {
		System.out.println(Q32_withoutX.withoutX("xHi"));
	}

	/**
	 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
	 * and otherwise return the string unchanged.
	 * 
	 * withoutX("xHix") → "Hi"
	 * withoutX("xHi") → "Hi"
	 * withoutX("Hxix") → "Hxi"
	 */

	/**TR
	 * Bir dize verildiğinde, ilk veya son karakterler 'x' ise, dizeyi bu 'x' karakterleri olmadan döndürün ve 
	 * aksi takdirde dizeyi değiştirmeden döndürün.
	 * 
	 * withoutX("xHix") → "Hi"
	 * withoutX("xHi") → "Hi"
	 * withoutX("Hxix") → "Hxi" 
	 */

	public static String withoutX(String str) {
		if (str.length() > 0 && str.charAt(0) == 'x') {
			str = str.substring(1);
		}
		if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
			str = str.substring(0, str.length() - 1);
		}
		return str;
	}
}
