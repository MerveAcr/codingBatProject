package Warmup_1;

public class Q15_front22 {

	public static void main(String[] args) {
		System.out.println(Q15_front22.front22("Ha"));

	}

	/**
	 * Given a string, 
	 * take the first 2 chars and return the string with the 2 chars added at both the front and back, 
	 * so "kitten" yields"kikittenki". 
	 * If the string length is less than 2, use whatever chars are there.
	 * 
	 * front22("kitten") → "kikittenki"
	 * front22("Ha") → "HaHaHa"
	 * front22("abc") → "ababcab"
	 */

	/** TR
	 * Bir dize verildiğinde, 
	 * ilk 2 karakteri alın ve dizeyi hem öne hem de arkaya 2 karakter eklenmiş olarak döndürün,
	 * böylece "kitten" "kikittenki" verir. 
	 * Dize uzunluğu 2'den azsa, oradaki karakterleri kullanın.
	 * front22("kitten") → "kikittenki"
	 * front22("Ha") → "HaHaHa"
	 * front22("abc") → "ababcab" 
	 */

	public static String front22(String str) {
		if (str.length() >= 2) {
			String ilkIki = str.substring(0, 2);
			return ilkIki + str + ilkIki;
		} else {
			return str + str + str;
		}
	}
}
