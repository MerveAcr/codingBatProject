package Logic_1;

public class Q28_blueTicket {
	public static void main(String[] args) {
		System.out.println(Q28_blueTicket.blueTicket(6, 1, 4));
	}

	/**
	 * You have a blue lottery ticket, with ints a, b, and c on it. 
	 * This makes three pairs, which we'll call ab, bc, and ac. 
	 * Consider the sum of the numbers in each pair. 
	 * If any pair sums to exactly 10, the result is 10. 
	 * Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. 
	 * Otherwise the result is 0.
	 * 
	 * blueTicket(9, 1, 0) → 10
	 * blueTicket(9, 2, 0) → 0
	 * blueTicket(6, 1, 4) → 10
	 */

	/**TR
	 * Üzerinde a, b ve c harfleri olan mavi bir piyango biletiniz var. 
	 * Bu, ab, bc ve ac diyeceğimiz üç çift yapar. 
	 * Her çiftteki sayıların toplamını düşünün. 
	 * Herhangi bir çift toplamı tam olarak 10 ise, sonuç 10'dur. 
	 * Aksi takdirde, abs toplamı, bc veya ac toplamlarından tam olarak 10 fazlaysa, sonuç 5'tir. 
	 * Aksi halde sonuç 0'dır.
	 * 
	 * blueTicket(9, 1, 0) → 10
	 * blueTicket(9, 2, 0) → 0
	 * blueTicket(6, 1, 4) → 10
	 */

	public static int blueTicket(int a, int b, int c) {
		if (a + b == 10 || b + c == 10 || a + c == 10)
			return 10;
		if (a + b == b + c + 10 || a + b == a + c + 10)
			return 5;
		else
			return 0;
	}
}
