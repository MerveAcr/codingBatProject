package String_1;

public class Q29_without2 {

	public static void main(String[] args) {
		System.out.println(Q29_without2.without2("HelloHe"));
	}

	/**
	 * Given a string, if a length 2 substring appears at both its beginning and end, 
	 * return a string without the substring at the beginning, so "HelloHe" yields "lloHe". 
	 * The substring may overlap with itself, so "Hi" yields "". 
	 * Otherwise, return the original string unchanged.
	 * 
	 * without2("HelloHe") → "lloHe"
	 * without2("HelloHi") → "HelloHi"
	 * without2("Hi") → ""
	 */

	/**TR
	 * Bir dize verildiğinde, hem başında hem de sonunda uzunluk 2 alt dizesi görünüyorsa, 
	 * başında alt dize olmadan bir dize döndürün, 
	 * bu nedenle "HelloHe", "lloHe" sonucunu verir. 
	 * Alt dize kendisiyle örtüşebilir, bu nedenle "Hi", "" sonucunu verir. 
	 * Aksi takdirde, orijinal dizeyi değiştirmeden döndürün.
	 * 
	 * without2("HelloHe") → "lloHe"
	 * without2("HelloHi") → "HelloHi"
	 * without2("Hi") → "" 
	 */

	public static String without2(String str) {
		if (str.length() == 1)
			return str;
		else if (str.length() <= 2)
			return "";
		else if (str.substring(0, 2).equals(str.substring(str.length() - 2)))
			return str.substring(2);
		else
			return str;
	}
}
