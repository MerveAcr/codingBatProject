package Logic_1;

public class Q09_specialEleven {

	public static void main(String[] args) {
		System.out.println(Q09_specialEleven.specialEleven(121));
	}

	/**
	 * We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. 
	 * Return true if the given non-negative number is special. 
	 * Use the % "mod" operator -- see Introduction to Mod
	 * 
	 * specialEleven(22) → true
	 * specialEleven(23) → true
	 * specialEleven(24) → false
	 */

	/** TR
	 * Bir sayı 11'in katıysa veya 11'in katıysa özeldir diyeceğiz. 
	 * Verilen negatif olmayan sayı özelse true değerini döndürün. 
	 * % "mod" operatörünü kullanın 
	 * 
	 * specialEleven(22) → true
	 * specialEleven(23) → true
	 * specialEleven(24) → false
	 */

	public static boolean specialEleven(int n) {
		if (n % 11 == 0 || n % 11 == 1)
			return true;
		else
			return false;
	}
}
