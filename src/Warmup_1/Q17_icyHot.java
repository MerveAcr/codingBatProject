package Warmup_1;

public class Q17_icyHot {

	public static void main(String[] args) {
		System.out.println(Q17_icyHot.icyHot(120, -1));

	}

	/**
	 * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
	 * 
	 * icyHot(120, -1) → true
	 * icyHot(-1, 120) → true
	 * icyHot(2, 120) → false
	 */

	/** TR
	 * İki sıcaklık verildiğinde, biri 0'dan küçük ve diğeri 100'den büyükse true değerini döndürür.
	 * 
	 * icyHot(120, -1) → true
	 * icyHot(-1, 120) → true
	 * icyHot(2, 120) → false
	 */

	public static boolean icyHot(int temp1, int temp2) {
		return (temp1 > 100 && temp2 < 0 || temp1 < 0 && temp2 > 100);
	}
}
