package Warmup_2;

public class Q03_countXX {

	public static void main(String[] args) {
		System.out.println(Q03_countXX.countXX("Hexxlloxx"));
	}

	/**
	 * Count the number of "xx" in the given string. 
	 * We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
	 * 
	 * countXX("abcxx") → 1
	 * countXX("xxx") → 2
	 * countXX("xxxx") → 3
	 */

	/** TR
	 * Verilen dizedeki "xx" sayısını sayın.
	 * Örtüşmeye (cakismaya ) izin verildiği icin , "xxx" 2 "xx" içerir.
	 * 
	 * countXX("abcxx") → 1
	 * countXX("xxx") → 2
	 * countXX("xxxx") → 3
	 *
	 */

	public static int countXX(String str) {
		int result = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("xx")) {
				result++;
			}
		}
		return result;
	}
}
