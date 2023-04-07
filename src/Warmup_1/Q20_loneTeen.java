package Warmup_1;

public class Q20_loneTeen {

	public static void main(String[] args) {
		System.out.println(Q20_loneTeen.loneTeen(99, 99));
	}

	/**
	 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
	 * Given 2 int values, return true if one or the other is teen, but not both.
	 * 
	 * loneTeen(13, 99) → true
	 * loneTeen(21, 19) → true
	 * loneTeen(13, 13) → false
	 */

	/** TR
	 * 13..19 dahil aralığındaysa bir sayının "teen" olduğunu söyleyeceğiz. 
	 * 2 int değeri verildiğinde, biri veya diğeri teen ise , ancak ikisi birden teen değilse "true" değerini döndürün.
	 * 
	 * loneTeen(13, 99) → true
	 * loneTeen(21, 19) → true
	 * loneTeen(13, 13) → false 
	 */

	public static boolean loneTeen(int a, int b) {
		// Store teen-ness in boolean local vars first.      (Teen i önce boolean yerel değişkenlerinde saklayın.) 
		// Boolean local vars like this are a little rare,   (Bunun gibi yerel Boolean değişkenleri biraz nadirdir, 
		//but here they work great. 						        ancak burada harika çalışıyorlar.)

		boolean aTeen = (a >= 13 && b <= 19);
		boolean bTeen = (a >= 13 && b <= 19);

		return (aTeen && !bTeen || !aTeen && bTeen);
	}

}
