package Logic_1;

public class Q24_withoutDoubles {
	public static void main(String[] args) {
		System.out.println(Q24_withoutDoubles.withoutDoubles(2, 3, true));
	}

	/**
	 * Return the sum of two 6-sided dice rolls, each in the range 1..6. 
	 * However, if noDoubles is true, if the two dice show the same value, 
	 * increment one die to the next value, wrapping around to 1 if its value was 6.
	 * 
	 * withoutDoubles(2, 3, true) → 5
	 * withoutDoubles(3, 3, true) → 7
	 * withoutDoubles(3, 3, false) → 6
	 */

	/**TR
	 * Her biri 1..6 aralığında olan iki adet 6 taraflı zar atışının toplamını döndürün. 
	 * Bununla birlikte, noDoubles doğruysa, iki zar aynı değeri gösteriyorsa, 
	 * bir zari sonraki değere arttırın, değeri 6 ise 1'e sarın.
	 * 
	 * withoutDoubles(2, 3, true) → 5
	 * withoutDoubles(3, 3, true) → 7
	 * withoutDoubles(3, 3, false) → 6
	 */

	public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if (die1 == 6 && die2 == 6 && noDoubles)
			return 7;
		else if (die1 == die2 && noDoubles)
			return die1 + die2 + 1;
		else
			return die1 + die2;
	}
}
