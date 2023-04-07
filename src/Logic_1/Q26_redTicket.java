package Logic_1;

public class Q26_redTicket {
	public static void main(String[] args) {
		System.out.println(Q26_redTicket.redTicket(2, 2, 2));
	}

	/**
	 * You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. 
	 * If they are all the value 2, the result is 10. 
	 * Otherwise if they are all the same, the result is 5. 
	 * Otherwise so long as both b and c are different from a, the result is 1. 
	 * Otherwise the result is 0.
	 * 
	 * redTicket(2, 2, 2) → 10
	 * redTicket(2, 2, 1) → 0
	 * redTicket(0, 0, 0) → 5
	 */

	/**TR
	 * Her biri 0, 1 veya 2 olan a, b ve c'yi gösteren kırmızı bir piyango biletiniz var. 
	 * Hepsi 2 değerindeyse, sonuç 10'dur. 
	 * Aksi takdirde, hepsi aynıysa, sonuç 5. 
	 * Aksi takdirde, hem b hem de c, a'dan farklı olduğu sürece sonuç 1'dir. Aksi halde sonuç 0'dır.
	 * 
	 * redTicket(2, 2, 2) → 10
	 * redTicket(2, 2, 1) → 0
	 * redTicket(0, 0, 0) → 5
	 */

	public static int redTicket(int a, int b, int c) {
		if (a == 2 && b == 2 && c == 2)
			return 10;
		else if (a == b && b == c)
			return 5;
		else if (a != b && a != c)
			return 1;
		else
			return 0;
	}
}
