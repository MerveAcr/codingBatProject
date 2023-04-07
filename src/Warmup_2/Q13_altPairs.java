package Warmup_2;

public class Q13_altPairs {

	public static void main(String[] args) {
		System.out.println(Q13_altPairs.altPairs("Chocolate"));
	}

	/**
	 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
	 * 
	 * altPairs("kitten") → "kien"
	 * altPairs("Chocolate") → "Chole"
	 * altPairs("CodingHorror") → "Congrr"
	 */

	/** TR
	 * Bir dize verildiğinde, 0,1, 4,5, 8,9 ...dizinlerindeki karakterlerden oluşan bir dize döndürün, 
	 * böylece "kitten" "kien" verir.
	 * 
	 * altPairs("kitten") → "kien"
	 * altPairs("Chocolate") → "Chole"
	 * altPairs("CodingHorror") → "Congrr"
	 */

	public static String altPairs(String str) {
		String text = "";
		for (int i = 0; i < str.length(); i += 4) {
			int end = i + 2;
			if (end > str.length()) {
				end = str.length();
			}
			text += str.substring(i, end);
		}
		return text;
	}

}
