package Warmup_1;

public class Q31_everyNth {

	public static void main(String[] args) {
		System.out.println(Q31_everyNth.everyNth("Miracle", 2));

	}

	/**
	 * Given a non-empty string and an int N, 
	 * return the string made starting with char 0, and then every Nth char of the string. 
	 * So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
	 * 
	 * everyNth("Miracle", 2) → "Mrce"
	 * everyNth("abcdefg", 2) → "aceg"
	 * everyNth("abcdefg", 3) → "adg"
	 */

	/**
	 * Boş olmayan bir dize ve bir int N verildiğinde,
	 * 0. dizeyi ve ardından dizenin her N. karakterini döndür.
	 * Yani N 3 ise, karakter 0, 3, 6, ... vb. kullanın. N, 1 veya daha fazladır.
	 * 
	 * everyNth("Miracle", 2) → "Mrce"
	 * everyNth("abcdefg", 2) → "aceg"
	 * everyNth("abcdefg", 3) → "adg"
	 */

	public static String everyNth(String str, int n) {
		String bos = "";
		for (int i = 0; i < str.length(); i += n)
			bos = bos + str.charAt(i);
		return bos;
	}

}
