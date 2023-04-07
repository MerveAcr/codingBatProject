package String_1;

public class Q28_extraFront {

	public static void main(String[] args) {
		System.out.println(Q28_extraFront.extraFront("Candy"));
	}

	/**
	 * Given a string, return a new string made of 3 copies of the first 2 chars of the original string. 
	 * The string may be any length. 
	 * If there are fewer than 2 chars, use whatever is there.
	 * 
	 * extraFront("Hello") → "HeHeHe"
	 * extraFront("ab") → "ababab"
	 * extraFront("H") → "HHH"
	 */

	/**TR
	 * Bir dize verildiğinde, orijinal dizenin ilk 2 karakterinin 3 kopyasından oluşan yeni bir dize döndürün. 
	 * Dize herhangi bir uzunlukta olabilir. 
	 * 2'den az karakter varsa, orada olanı kullanın.
	 * 
	 * extraFront("Hello") → "HeHeHe"
	 * extraFront("ab") → "ababab"
	 * extraFront("H") → "HHH"
	 */

	public static String extraFront(String str) {
		if (str.length() >= 2)
			return str.substring(0, 2) + "" + str.substring(0, 2) + "" + str.substring(0, 2);
		else
			return str + str + str;
	}

}
