package Warmup_1;

public class Q16_startHi {

	public static void main(String[] args) {
		System.out.println(Q16_startHi.startHi("hi there"));

	}

	/**
	 * Given a string, return true if the string starts with "hi" and false otherwise.
	 * 
	 * startHi("hi there") → true
	 * startHi("hi") → true
	 * startHi("hello hi") → false
	 */

	/** TR
	 * Bir dize verildiğinde, dize "hi" ile başlıyorsa true, aksi takdirde false döndürür.
	 * 
	 * startHi("hi there") → true
	 * startHi("hi") → true
	 * startHi("hello hi") → false 
	 */

	public static boolean startHi(String str) {
		return str.startsWith("hi");
	}
}
