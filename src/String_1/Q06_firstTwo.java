package String_1;

public class Q06_firstTwo {

	public static void main(String[] args) {
		System.out.println(Q06_firstTwo.firstTwo("Software"));
	}

	/**
	 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". 
	 * If the string is shorter than length 2, return whatever there is, 
	 * so "X" yields "X", and the empty string "" yields the empty string "". 
	 * Note that str.length() returns the length of a string.
	 * 
	 * firstTwo("Hello") → "He"
	 * firstTwo("abcdefg") → "ab"
	 * firstTwo("ab") → "ab"
	 */

	/**TR
	 * Bir dize verildiğinde, ilk iki karakterinden oluşan dizeyi döndürün, böylece "Hello" Dizesi "He" verir. 
	 * Dize uzunluk 2'den kısaysa, ne varsa döndürün, 
	 * bu nedenle "X", "X"'i verir ve boş "" dizesi boş "" dizesini verir. 
	 * str.length()'in bir dizgenin uzunluğunu döndürdüğünü unutmayın.
	 * 
	 * firstTwo("Hello") → "He"
	 * firstTwo("abcdefg") → "ab"
	 * firstTwo("ab") → "ab" 
	 */

	public static String firstTwo(String str) {
		if (str.length() >= 2)
			return str.substring(0, 2);
		else
			return str;
	}

}
