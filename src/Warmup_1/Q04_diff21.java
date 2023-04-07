package Warmup_1;

public class Q04_diff21 {

	public static void main(String[] args) {
		System.out.println(Q04_diff21.diff21(11));
	}

	/**
	 * Given an int n, return the absolute difference between n and 21, 
	 * except return double the absolute difference if n is over 21.
	 */

	/** TR
	 * Bir int n verildiðinde, n ile 21 arasýndaki mutlak farký döndürün,
	 * n degeri 21'den buyukse mutlak farký iki katýna döndürün.
	 */

	public static int diff21(int n) {
		if (n <= 21) {
			return 21 - n;
		} else {
			return 2 * (n - 21);
		}
	}
}
