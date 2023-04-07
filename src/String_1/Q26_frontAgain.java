package String_1;

public class Q26_frontAgain {

	public static void main(String[] args) {
		System.out.println(Q26_frontAgain.frontAgain("javaja"));
	}

	/**
	 * Given a string, return true if the first 2 chars in the string also appear at the end of the string, 
	 * such as with "edited".
	 * 
	 * frontAgain("edited") → true
	 * frontAgain("edit") → false
	 * frontAgain("ed") → true
	 */

	/**TR
	 * Bir dize verildiğinde, "edited" gibi dizedeki ilk 2 karakter de dizenin sonunda görünüyorsa true değerini döndürün.
	 * 
	 * frontAgain("edited") → true
	 * frontAgain("edit") → false
	 * frontAgain("ed") → true
	 */

	public static boolean frontAgain(String str) {
		if (str.length() >= 2) {
			if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
