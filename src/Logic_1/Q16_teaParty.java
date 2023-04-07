package Logic_1;

public class Q16_teaParty {

	public static void main(String[] args) {
		System.out.println(Q16_teaParty.teaParty(3, 8));
	}

	/**
	 * We are having a party with amounts of tea and candy. 
	 * Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. 
	 * A party is good (1) if both tea and candy are at least 5. 
	 * However, if either tea or candy is at least double the amount of the other one, the party is great (2). 
	 * However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
	 * 
	 * teaParty(6, 8) → 1
	 * teaParty(3, 8) → 0
	 * teaParty(20, 6) → 2
	 */

	/**TR
	 * Bol miktarda çay ve şekerle parti veriyoruz. 
	 * 0=kötü, 1=iyi veya 2=büyük olarak kodlanmış tarafın int sonucunu döndürün. 
	 * Bir parti (1) hem çay hem de şeker en az 5 ise iyidir. 
	 * Ancak, çay veya şekerlerden biri diğerinin en az iki katı ise parti harikadır (2). 
	 * Bununla birlikte, her durumda, çay veya şekerden biri 5'ten azsa, parti her zaman kötüdür (0).
	 * 
	 * teaParty(6, 8) → 1
	 * teaParty(3, 8) → 0
	 * teaParty(20, 6) → 2
	 */

	public static int teaParty(int tea, int candy) {
		if (tea < 5 || candy < 5)
			return 0;
		if (tea >= (candy * 2) || candy >= (tea * 2))
			return 2;
		else //(tea>=5 && candy>=5)
			return 1;

	}
}
