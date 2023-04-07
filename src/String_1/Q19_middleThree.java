package String_1;

public class Q19_middleThree {

	public static void main(String[] args) {
		System.out.println(Q19_middleThree.middleThree("solving"));
	}

	/**
	 * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". 
	 * The string length will be at least 3.
	 * 
	 *middleThree("Candy") → "and"
	 *middleThree("and") → "and"
	 *middleThree("solving") → "lvi"
	 */

	/**TR
	 * Tek sayi uzunlugunda bir dize verildiğinde, dizenin ortasindaki 3 kararkteri döndürün, böylece "Candy" "and" verir. 
	 * Dize uzunluğu en az 3 olacaktır.
	 * 
	 *middleThree("Candy") → "and"
	 *middleThree("and") → "and"
	 *middleThree("solving") → "lvi"
	 */

	public static String middleThree(String str) {
		int middle = str.length() / 2;
		return str.substring(middle - 1, middle + 2);
	}
}
