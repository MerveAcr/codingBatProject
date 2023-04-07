package Logic_1;

public class Q29_shareDigit {
	public static void main(String[] args) {
		System.out.println(Q29_shareDigit.shareDigit(12, 43));
	}

	/**
	 * Given two ints, each in the range 10..99, 
	 * return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. 
	 * (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
	 * 
	 * shareDigit(12, 23) → true
	 * shareDigit(12, 43) → false
	 * shareDigit(12, 44) → false
	 */

	/**TR
	 * Her biri 10..99 aralığında olan iki int verildiğinde, 
	 * 12 ve 23'te 2 gibi her iki sayıda da görünen bir rakam varsa true değerini döndürür. 
	 * (Not: bölme, örneğin n/10, sol basamağı verir. % "mod" n %10 doğru rakamı verir.)
	 * 
	 * shareDigit(12, 23) → true
	 * shareDigit(12, 43) → false
	 * shareDigit(12, 44) → false
	 */

	public static boolean shareDigit(int a, int b) {
		if (a / 10 == b / 10 || a % 10 == b % 10 || a / 10 == b % 10 || b / 10 == a % 10)
			return true;
		else
			return false;
	}
}
