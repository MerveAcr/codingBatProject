package Warmup_1;

public class Q09_notString {

	public static void main(String[] args) {
		System.out.println(Q09_notString.notString("candy"));

	}

	/**
	 * Given a string, return a new string where "not " has been added to the front. 
	 * However, if the string already begins with "not", return the string unchanged. 
	 * Note: use .equals() to compare 2 strings.
	 * 
	 * notString("candy") → "not candy"
	 * notString("x") → "not x"
	 * notString("not bad") → "not bad"
	 */

	/** TR
	 * Bir dize verildiğinde, önüne "not" eklenmiş yeni bir dize döndürün.
	 * Ancak, dize zaten "not" ile başlıyorsa, dizeyi değiştirmeden döndürün. 
	 * Not: 2 dizeyi karşılaştırmak için .equals() kullanın.
	 * 
	 * notString("candy") → "not candy"
	 * notString("x") → "not x"
	 * notString("not bad") → "not bad"
	 */

	public static String notString(String str) {
		if (str.startsWith("not")) {
			return str;
		} else {
			return "not " + str;
		}
	}
}
