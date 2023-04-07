package Warmup_2;

public class Q02_frontTimes {

	public static void main(String[] args) {
		System.out.println(Q02_frontTimes.frontTimes("Engineer", 4));
	}

	/**
	 * Given a string and a non-negative int n, 
	 * we'll say that the front of the string is the first 3 chars, 
	 * or whatever is there if the string is less than length 3. Return n copies of the front;
	 * 
	 * frontTimes("Chocolate", 2) → "ChoCho"
	 * frontTimes("Chocolate", 3) → "ChoChoCho"
	 * frontTimes("Abc", 3) → "AbcAbcAbc"
	 */

	/**TR
	 * Bir dizge ve negatif olmayan bir int n verildiğinde, 
	 * dizenin ilk 3 karakterini n sayisi kadar yazdir
	 * ya da dizgenin uzunluğu 3'ten küçükse dizenin tamamini n sayisi kadar yazdir 
	 * 
	 * frontTimes("Chocolate", 2) → "ChoCho"
	 * frontTimes("Chocolate", 3) → "ChoChoCho"
	 * frontTimes("Abc", 3) → "AbcAbcAbc"
	 */

	public static String frontTimes(String str, int n) {
		String text = "";
		if (str.length() >= 3) {
			for (int i = 1; i <= n; i++) {
				text = text + str.substring(0, 3);
			}
			return text;
		} else {
			for (int i = 1; i <= n; i++) {
				text = text + str;
			}
			return text;
		}
	}
}
