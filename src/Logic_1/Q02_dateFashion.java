package Logic_1;

public class Q02_dateFashion {

	public static void main(String[] args) {
		System.out.println(Q02_dateFashion.dateFashion(5, 10));

	}

	/**
	 * You and your date are trying to get a table at a restaurant. 
	 * The parameter "you" is the stylishness of your clothes, 
	 * in the range 0..10, and "date" is the stylishness of your date's clothes. 
	 * The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. 
	 * If either of you is very stylish, 8 or more, then the result is 2 (yes). 
	 * With the exception that if either of you has style of 2 or less, then the result is 0 (no). 
	 * Otherwise the result is 1 (maybe).
	 * 
	 * dateFashion(5, 10) → 2
	 * dateFashion(5, 2) → 0
	 * dateFashion(5, 5) → 1
	 */

	/**TR
	 * Sen ve randevun bir restoranda masa bulmaya çalışıyorsunuz. 
	 * "you" parametresi kıyafetlerinizin şıklığı, 0..10 aralığında, 
	 * "date" ise randevunuzun kıyafetlerinin şıklığıdır. 
	 * Tabloyu elde eden sonuç, 0=hayır, 1=belki, 2=evet ile bir int değeri olarak kodlanır. 
	 * İkinizden biri çok şık, 8 veya daha fazla ise sonuç 2 (evet). 
	 * Bunun dışında, ikinizden birinin stili 2 veya daha azsa, sonuç 0 (hayır) olur. 
	 * Aksi takdirde sonuç 1'dir (belki).
	 * 
	 * dateFashion(5, 10) → 2
	 * dateFashion(5, 2) → 0
	 * dateFashion(5, 5) → 1
	 */

	public static int dateFashion(int you, int date) {
		if (you <= 2 || date <= 2)
			return 0;
		else if (you >= 8 || date >= 8)
			return 2;
		else
			return 1;
	}

}
