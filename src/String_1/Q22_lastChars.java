package String_1;

public class Q22_lastChars {

	public static void main(String[] args) {
		System.out.println(Q22_lastChars.lastChars("last", "chars"));
	}

	/**
	 * Given 2 strings, a and b, 
	 * return a new string made of the first char of a and the last char of b, 
	 * so "yo" and "java" yields "ya". 
	 * If either string is length 0, use '@' for its missing char.
	 * 
	 * lastChars("last", "chars") → "ls"
	 * lastChars("yo", "java") → "ya"
	 * lastChars("hi", "") → "h@"
	 */

	/**TR
	 * Verilen 2 dize, a ve b, 
	 * a'nın ilk karakterinden ve b'nin son karakterinden oluşan yeni bir dize döndürür, 
	 * bu nedenle "yo" ve "java", "ya" verir. 
	 * Dizelerden herhangi biri 0 uzunluğundaysa, eksik karakteri için '@' kullanın.
	 * 
	 * lastChars("last", "chars") → "ls"
	 * lastChars("yo", "java") → "ya"
	 * lastChars("hi", "") → "h@"
	 */

	public static String lastChars(String a, String b) {
		if ((a.length() > 0) && (b.length() > 0)) {
			return (a.charAt(0)) + "" + (b.charAt(b.length() - 1));
		} else if (a.length() < 1 && b.length() < 1) {
			return "@" + "@";
		} else if (a.length() < 1) {
			return "@" + (b.charAt(b.length() - 1));
		} else {
			return a.charAt(0) + "@";
		}
	}

}
