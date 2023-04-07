package String_1;

public class Q21_atFirst {

	public static void main(String[] args) {
		System.out.println(Q21_atFirst.atFirst("h"));
	}

	/**
	 * Given a string, return a string length 2 made of its first 2 chars. 
	 * If the string length is less than 2, use '@' for the missing chars.
	 * 
	 * atFirst("hello") → "he"
	 * atFirst("hi") → "hi"
	 * atFirst("h") → "h@"
	 */

	/**TR
	 * Bir dize verildiğinde, ilk 2 karakterinden oluşan bir dize döndürün. 
	 * Dize uzunluğu 2'den azsa, eksik karakterler için '@' kullanın.
	 * 
	 * atFirst("hello") → "he"
	 * atFirst("hi") → "hi"
	 * atFirst("h") → "h@"
	 */

	public static String atFirst(String str) {
		if (str.length() >= 2)
			return str.substring(0, 2);
		else if (str == "")
			return "@" + "@";
		else
			return str + "@";
	}
}
