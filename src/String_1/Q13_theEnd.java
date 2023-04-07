package String_1;

public class Q13_theEnd {

	public static void main(String[] args) {
		System.out.println(Q13_theEnd.theEnd("java", true));
	}

	/**
	 * Given a string, return a string length 1 from its front, 
	 * unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
	 * 
	 * theEnd("Hello", true) → "H"
	 * theEnd("Hello", false) → "o"
	 * theEnd("oh", true) → "o"
	 */

	/**TR
	 * Bir dize verildiğinde, front parameteri true ise dizenin ilk karakterini , 
	 * front parameteri false ise dizenin son kararkterini dondurun.
	 * Dize boş olmayacak.
	 * 
	 * theEnd("Hello", true) → "H"
	 * theEnd("Hello", false) → "o"
	 * theEnd("oh", true) → "o"
	 */

	public static String theEnd(String str, boolean front) {
		if (!front)
			return str.substring(str.length() - 1);
		else
			return str.substring(0, 1);
	}
}
