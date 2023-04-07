package String_1;

public class Q25_seeColor {

	public static void main(String[] args) {
		System.out.println(Q25_seeColor.seeColor("blueTimes"));
	}

	/**
	 * Given a string, if the string begins with "red" or "blue" return that color string, 
	 * otherwise return the empty string.
	 * 
	 *seeColor("redxx") → "red"
	 *seeColor("xxred") → ""
	 *seeColor("blueTimes") → "blue"
	 */

	/**TR
	 * Bir dize verildiğinde, dize "red" veya "blue" ile başlıyorsa, o renk dizesini döndürür, 
	 * aksi takdirde boş dizeyi döndürür.
	 * 
	 *seeColor("redxx") → "red"
	 *seeColor("xxred") → ""
	 *seeColor("blueTimes") → "blue"
	 */

	public static String seeColor(String str) {
		if (str.startsWith("red"))
			return "red";
		else if (str.startsWith("blue"))
			return "blue";
		else
			return "";
	}
}
