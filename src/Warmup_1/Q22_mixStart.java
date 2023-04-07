package Warmup_1;

public class Q22_mixStart {

	public static void main(String[] args) {
		System.out.println(Q22_mixStart.mixStart("mix snacks"));
	}

	/**
	 * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
	 * 
	 * mixStart("mix snacks") → true
	 * mixStart("pix snacks") → true
	 * mixStart("piz snacks") → false
	 */

	/** TR
	 * Verilen dize "mix" ile başlıyorsa true değerini döndürün,
	 * 'm' dışında herhangi bir şey olabilir, bu nedenle "pix", "9ix" .. hepsi sayılır.
	 * 
	 * mixStart("mix snacks") → true
	 * mixStart("pix snacks") → true
	 * mixStart("piz snacks") → false 
	 */

	public static boolean mixStart(String str) {
		if (str.length() < 3)
			return false;
		String two = str.substring(1, 3);
		if (two.equals("ix"))
			return true;

		else
			return false;
	}

}
