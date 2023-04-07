package Warmup_1;

public class Q21_delDel {

	public static void main(String[] args) {
		System.out.println(Q21_delDel.delDel("adelbc"));
	}

	/**
	 * Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. 
	 * Otherwise, return the string unchanged.
	 * 
	 * delDel("adelbc") → "abc"
	 * delDel("adelHello") → "aHello"
	 * delDel("adedbc") → "adedbc"
	 * 
	 */

	/** TR
	 * Bir dize verildiğinde, "del" dizesi dizin 1'den başlayarak görünüyorsa, "del"in silindiği bir dize döndürün.
	 * Aksi takdirde, dizeyi değiştirmeden döndürün.
	 * 
	 * delDel("adelbc") → "abc"
	 * delDel("adelHello") → "aHello"
	 * delDel("adedbc") → "adedbc"
	 */

	public static String delDel(String str) {
		if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
			String newStr = str.charAt(0) + str.substring(4);
			return newStr;
		}
		return str;
	}

}
