package String_1;

public class Q16_endsLy {

	public static void main(String[] args) {
		System.out.println(Q16_endsLy.endsLy("phone"));
	}

	/**
	 * Given a string, return true if it ends in "ly".
	 * 
	 * endsLy("oddly") → true
	 * endsLy("y") → false
	 * endsLy("oddy") → false
	 */

	/** TR
	 * Bir dize verildiğinde, "ly" ile bitiyorsa true değerini döndürür.
	 * 
	 * endsLy("oddly") → true
	 * endsLy("y") → false
	 * endsLy("oddy") → false
	 */

	public static boolean endsLy(String str) {
		if (str.length() <= 1)
			return false;
		String lastTwo = str.substring(str.length() - 2);
		if (lastTwo.equals("ly"))
			return true;
		else
			return false;
	}
}
