package Warmup_1;

public class Q25_close10 {

	public static void main(String[] args) {
		System.out.println(Q25_close10.close10(8, 14));

	}

	/**
	 * Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
	 * Note that Math.abs(n) returns the absolute value of a number.
	 * 
	 * close10(8, 13) → 8
	 * close10(13, 8) → 8
	 * close10(13, 7) → 0
	 */

	/**TR
	 * 2 int değeri verildiğinde, 10 değerine en yakın olan değeri döndürün veya bir eşitlik durumunda 0 değerini döndürün.
	 * Math.abs(n) öğesinin bir sayının mutlak değerini döndürdüğünü unutmayın.
	 * 
	 * close10(8, 13) → 8
	 * close10(13, 8) → 8
	 * close10(13, 7) → 0
	 */

	public static int close10(int a, int b) {
		int aDiff = Math.abs(a - 10);
		int bDiff = Math.abs(b - 10);

		if (aDiff < bDiff) {
			return a;
		}
		if (bDiff < aDiff) {
			return b;
		}
		return 0;
	}

}
