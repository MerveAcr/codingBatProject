package Logic_1;

public class Q14_teenSum {

	public static void main(String[] args) {
		System.out.println(Q14_teenSum.teenSum(13, 2));
	}

	/**
	 * Given 2 ints, a and b, return their sum. 
	 * However, "teen" values in the range 13..19 inclusive, are extra lucky. 
	 * So if either value is a teen, just return 19.
	 * 
	 * teenSum(3, 4) → 7
	 * teenSum(10, 13) → 19
	 * teenSum(13, 2) → 19
	 */

	/**TR
	 * Verilen 2 int, a ve b, toplamlarını döndürür. 
	 * Ancak, 13..19 dahil aralığındaki "genç" değerler ekstra şanslıdır. 
	 * Bu nedenle, değerlerden herhangi biri bir genç ise, sadece 19 döndürün.
	 * 
	 * teenSum(3, 4) → 7
	 * teenSum(10, 13) → 19
	 * teenSum(13, 2) → 19
	 */

	public static int teenSum(int a, int b) {
		if (a >= 13 && a <= 19 || b >= 13 && b <= 19)
			return 19;
		else
			return a + b;
	}
}
