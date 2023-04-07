package String_1;

public class Q33_withoutX2 {

	public static void main(String[] args) {
		System.out.println(Q33_withoutX2.withoutX2("Hxi"));
	}

	/**
	 * Given a string, if one or both of the first 2 chars is 'x', 
	 * return the string without those 'x' chars, and otherwise return the string unchanged. 
	 * This is a little harder than it looks.
	 * 
	 * withoutX2("xHi") → "Hi"
	 * withoutX2("Hxi") → "Hi"
	 * withoutX2("Hi") → "Hi"
	 */

	/**TR
	 * Bir dize verildiğinde, ilk 2 karakterden biri veya her ikisi 'x' ise, dizeyi bu 'x' karakterleri olmadan döndürün 
	 * ve aksi takdirde dizeyi değiştirmeden döndürün.
	 * 
	 * withoutX2("xHi") → "Hi"
	 * withoutX2("Hxi") → "Hi"
	 * withoutX2("Hi") → "Hi"
	 */

	public static String withoutX2(String str) {
		if (str.length() <= 1) {
			str = "";
		}
		if (str.length() > 0 && str.charAt(0) == 'x' && str.charAt(1) == 'x') {
			str = str.substring(2);
		}
		if (str.length() > 0 && str.charAt(0) == 'x') {
			str = str.substring(1);
		} else if (str.length() > 0 && str.charAt(1) == 'x') {
			str = str.substring(0, 1) + str.substring(2);
		}
		return str;
	}

}
