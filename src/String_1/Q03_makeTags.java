package String_1;

public class Q03_makeTags {

	public static void main(String[] args) {
		System.out.println(Q03_makeTags.makeTags("i", "Hello"));
	}

	/**
	 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
	 * In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
	 * Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
	 * 
	 * makeTags("i", "Yay") → "<i>Yay</i>"
	 * makeTags("i", "Hello") → "<i>Hello</i>"
	 * makeTags("cite", "Yay") → "<cite>Yay</cite>"
	 */

	/** TR
	 * Web, Yay'ı italik metin olarak çizen "<i>Yay</i>" gibi HTML dizeleriyle oluşturulmuştur. 
	 * Bu örnekte, "i" etiketi, "Yay" kelimesini çevreleyen <i> ve </i>'yi yapar. 
	 * Verilen etiket ve kelime dizgileri, kelimenin etrafındaki etiketlerle HTML dizgisini oluşturun, örneğin "<i>Yay</i>".
	 * 
	 * makeTags("i", "Yay") → "<i>Yay</i>"
	 * makeTags("i", "Hello") → "<i>Hello</i>"
	 * makeTags("cite", "Yay") → "<cite>Yay</cite>"
	 */

	public static String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

}
