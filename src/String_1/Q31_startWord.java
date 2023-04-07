package String_1;

public class Q31_startWord {

	public static void main(String[] args) {
		System.out.println(Q31_startWord.startWord("kitten", "cit"));
	}

	/**
	 * Given a string and a second "word" string, 
	 * we'll say that the word matches the string if it appears at the front of the string, 
	 * except its first char does not need to match exactly. 
	 * On a match, return the front of the string, or otherwise return the empty string. 
	 * So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". 
	 * The word will be at least length 1.
	 * 
	 * startWord("hippo", "hi") → "hi"
	 * startWord("hippo", "xip") → "hip"
	 * startWord("hippo", "i") → "h"
	 */

	/** TR
	 * Bir string ve ikinci bir "word" kelimesi verildiğinde, ilk karakterin tam olarak eşleşmesi gerekmemesi dışında, 
	 * string in önünde görünüyorsa, sözcüğün string eşleştiğini söyleyeceğiz. 
	 * Bir eşleşmede, str in önünü döndürün veya boş dizeyi döndürün. 
	 * Yani, "hippo" dizesiyle "hi" kelimesi "hi" ve "xip" "hip" döndürür. 
	 * Kelime en az 1 uzunluğunda olacaktır.
	 * 
	 * startWord("hippo", "hi") → "hi"
	 * startWord("hippo", "xip") → "hip"
	 * startWord("hippo", "i") → "h"
	 */

	public static String startWord(String str, String word) {
		int lenStr = str.length();
		int lenWord = word.length();
		if (lenStr == 0) {
			return "";
		}
		if (lenWord > lenStr) {
			return "";
		}
		if (word.length() == 1) {
			return str.substring(0, 1);
		} else if (str.substring(1, lenWord).equals(word.substring(1, lenWord))) {
			return str.substring(0, lenWord);
		} else {
			return "";
		}
	}

}
