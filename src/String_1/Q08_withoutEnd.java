package String_1;

public class Q08_withoutEnd {

	public static void main(String[] args) {
		System.out.println(Q08_withoutEnd.withoutEnd("java"));
	}

	/**
	 * Given a string, return a version without the first and last char, 
	 * so "Hello" yields "ell". The string length will be at least 2.
	 * 
	 * withoutEnd("Hello") → "ell"
	 * withoutEnd("java") → "av"
	 * withoutEnd("coding") → "odin"
	 */

	/**TR
	 * Bir dize verildiğinde, ilk ve son karakter olmadan bir sürüm döndürür, 
	 * böylece "Hello", "ell" verir. Dize uzunluğu en az 2 olacaktır.
	 * 
	 * withoutEnd("Hello") → "ell"
	 * withoutEnd("java") → "av"
	 * withoutEnd("coding") → "odin"
	 */

	public static String withoutEnd(String str) {
		return str.substring(1, str.length() - 1);
	}
}
