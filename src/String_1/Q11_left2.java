package String_1;

public class Q11_left2 {

	public static void main(String[] args) {
		System.out.println(Q11_left2.left2("code"));
	}

	/**
	 * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
	 * The string length will be at least 2.
	 * 
	 * left2("Hello") → "lloHe"
	 * left2("java") → "vaja"
	 * left2("Hi") → "Hi" 
	 */

	/**TR
	 * Bir dize verildiğinde, ilk 2 karakterin sonuna taşındığı bir "sol döndürülmüş 2" sürümü döndürün. 
	 * Dize uzunluğu en az 2 olacaktır.
	 * 
	 * left2("Hello") → "lloHe"
	 * left2("java") → "vaja"
	 * left2("Hi") → "Hi" 
	 */

	public static String left2(String str) {
		if (str.length() >= 2)
			return str.substring(2) + str.substring(0, 2);
		else
			return str;
	}

}
