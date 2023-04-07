package String_1;

public class Q30_deFront {

	public static void main(String[] args) {
		System.out.println(Q30_deFront.deFront("away"));
	}

	/**
	 * Given a string, return a version without the first 2 chars. 
	 * Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
	 * The string may be any length. 
	 * Harder than it looks.
	 * 
	 * deFront("Hello") → "llo"
	 * deFront("java") → "va"
	 * deFront("away") → "aay"
	 */

	/**TR
	 * Bir dize verildiğinde, ilk 2 karakter olmadan bir sürüm döndürün. 
	 * İlk karakteri 'a' ise, ikinci karakteri 'b' ise bu karakterleri cikarmayin. 
	 * Dize herhangi bir uzunlukta olabilir.
	 * 
	 * deFront("Hello") → "llo"
	 * deFront("java") → "va"
	 * deFront("away") → "aay"
	 */

	public static String deFront(String str) {
		if (str.substring(0, 2).equals("ab"))
			return str;
		else if (str.charAt(0) == 'a')
			return str.substring(0, 1) + str.substring(2);
		else if (str.charAt(1) == 'b')
			return str.substring(1);
		else
			return str.substring(2);
	}
}
