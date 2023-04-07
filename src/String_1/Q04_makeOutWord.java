package String_1;

public class Q04_makeOutWord {

	public static void main(String[] args) {
		System.out.println(Q04_makeOutWord.makeOutWord("[[]]", "Hello"));
	}

	/**
	 * Given an "out" string length 4, such as "<<>>", and a word, 
	 * return a new string where the word is in the middle of the out string, e.g. "<<word>>". 
	 * Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
	 *
	 *makeOutWord("<<>>", "Yay") → "<<Yay>>"
	 *makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
	 *makeOutWord("[[]]", "word") → "[[word]]"
	 */

	/** TR
	 * "<<>>" gibi bir "out" dize uzunluğu 4 ve bir kelime verildiğinde, 
	 * kelimenin çıkış dizesinin ortasında olduğu yerde yeni bir dize döndürün, örneğin "<<word>>". 
	 * Not: i dizininden başlayan ve j dizinine kadar çıkan ancak j dizinini içermeyen Dizeyi çıkarmak için str.substring(i, j) kullanın.
	 * 
	 *makeOutWord("<<>>", "Yay") → "<<Yay>>"
	 *makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
	 *makeOutWord("[[]]", "word") → "[[word]]"
	 */

	public static String makeOutWord(String out, String word) {
		return out.substring(0, 2) + word + out.substring(2, 4);
	}

}
