package Logic_1;

public class Q11_old35 {

	public static void main(String[] args) {
		System.out.println(Q11_old35.old35(18));
	}

	/**
	 * Return true if the given non-negative number is a multiple of 3 or 5, but not both. 
	 * Use the % "mod" operator -- see Introduction to Mod
	 * 
	 * old35(3) → true
	 * old35(10) → true
	 * old35(15) → false
	 */

	/**TR
	 * Verilen negatif olmayan sayı 3 veya 5'in katıysa ancak ikisi birden değilse true değerini döndürün. 
	 * % "mod" operatörünü kullanın
	 * 
	 * old35(3) → true
	 * old35(10) → true
	 * old35(15) → false
	 */

	public static boolean old35(int n) {
		if (n % 3 == 0 && n % 5 == 0)
			return false;
		else if (n % 3 == 0 || n % 5 == 0)
			return true;
		else
			return false;
	}

}
