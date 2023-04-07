package Warmup_1;

public class Q06_makes10 {

	public static void main(String[] args) {
		System.out.println(Q06_makes10.makes10Method1(7, 3));
	}

	/**
	 * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
	 * 
	 * makes10(9, 10) → true
	 * makes10(9, 9) → false
	 * makes10(1, 9) → true
	 */

	/** TR
	 * 2 int degeri olan a ve b parametreleri verildiginde,
	 * a veya b den birisi 10 ise veya a ve b toplami 10 ise true degeri döndürülür.
	 * 
	 * makes10(9, 10) → true
	 * makes10(9, 9) → false
	 * makes10(1, 9) → true
	 */

	public static boolean makes10Method1(int a, int b) {
		if (a == 10 || b == 10 || a + b == 10) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean makes10Method2(int a, int b) {
		return (a == 10 || b == 10 || a + b == 10);
	}

}
