package Warmup_1;

public class Q30_endUp {

	public static void main(String[] args) {
		System.out.println(Q30_endUp.endUp("Hello"));

	}

	/**
	 * Given a string, return a new string where the last 3 chars are now in upper case. 
	 * If the string has less than 3 chars, uppercase whatever is there. 
	 * Note that str.toUpperCase() returns the uppercase version of a string.
	 * 
	 * endUp("Hello") → "HeLLO"
	 * endUp("hi there") → "hi thERE"
	 * endUp("hi") → "HI"
	 */

	/** TR
	 * Bir dize verildiğinde, son 3 karakterin büyük harf olduğu yeni bir dize döndürün.
	 * Dize 3'ten az karaktere sahipse, tum dizeyi büyük harf ile yazdirin.
	 * str.toUpperCase() öğesinin bir dizenin büyük harfli sürümünü döndürdüğünü unutmayın.
	 * 
	 * endUp("Hello") → "HeLLO"
	 * endUp("hi there") → "hi thERE"
	 * endUp("hi") → "HI
	 */

	public static String endUp(String str) {
		if (str.length() <= 2) {
			return str.toUpperCase();
		}
		String sonUc = str.substring(str.length() - 3);
		return str.substring(0, str.length() - 3) + sonUc.toUpperCase();
	}

}
