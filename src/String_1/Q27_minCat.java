package String_1;

public class Q27_minCat {

	public static void main(String[] args) {
		System.out.println(Q27_minCat.minCat("Hello", "java"));
	}

	/**
	 * Given two strings, append them together (known as "concatenation") and return the result. 
	 * However, if the strings are different lengths, 
	 * omit chars from the longer string so it is the same length as the shorter string. 
	 * So "Hello" and "Hi" yield "loHi". The strings may be any length.
	 * 
	 * minCat("Hello", "Hi") → "loHi"
	 * minCat("Hello", "java") → "ellojava"
	 * minCat("java", "Hello") → "javaello"
	 */

	/**TR
	 * Verilen iki dize, bunları birbirine ekleyin ("concatenation" olarak bilinir) ve sonucu döndürün. 
	 * Ancak,dizeler farklı uzunluklardaysa,daha kısa dizeyle aynı uzunlukta olması için uzun dizedeki karakterleri atlayın. 
	 * Yani "Hello" ve "Hi", "loHi" verir. 
	 * Dizeler herhangi bir uzunlukta olabilir.
	 * 
	 * minCat("Hello", "Hi") → "loHi"
	 * minCat("Hello", "java") → "ellojava"
	 * minCat("java", "Hello") → "javaello"
	 */

	public static String minCat(String a, String b) {
		if (a.length() < b.length())
			return a + b.substring(b.length() - a.length());
		if (b.length() < a.length())
			return a.substring(a.length() - b.length()) + b;
		else
			return a + b;
	}
}
