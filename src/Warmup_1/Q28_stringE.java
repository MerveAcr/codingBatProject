package Warmup_1;

public class Q28_stringE {

	public static void main(String[] args) {
		System.out.println(Q28_stringE.stringE("Hello"));

	}

	/**
	 * Return true if the given string contains between 1 and 3 'e' chars.
	 * 
	 * stringE("Hello") → true
	 * stringE("Heelle") → true
	 * stringE("Heelele") → false
	 */

	/** TR
	 * Belirtilen dize 1 ile 3 arasında 'e' karakter içeriyorsa true değerini döndürün.
	 * 
	 * stringE("Hello") → true
	 * stringE("Heelle") → true
	 * stringE("Heelele") → false
	 */

	public static boolean stringE(String str) {
		int eSayisi = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e')
				eSayisi++;
		}
		if (eSayisi >= 1 && eSayisi <= 3)
			return true;
		else
			return false;
	}

}
