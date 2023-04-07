package Warmup_1;

public class Q05_parrotTrouble {

	public static void main(String[] args) {
		System.out.println(Q05_parrotTrouble.parrotTroubleMethod(false, 5));
	}

	/**
	 * We have a loud talking parrot. 
	 * The "hour" parameter is the current hour time in the range 0..23. 
	 * We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
	 * Return true if we are in trouble.
	 * 
	 * parrotTrouble(true, 6) → true
	 * parrotTrouble(true, 7) → false
	 * parrotTrouble(false, 6) → false
	 */

	/** TR
	 * Yüksek sesle konuşan bir papağanımız var. 
	 * "hour" parametresi, 0-23 aralığında geçerli saat zamanıdır. 
	 * Papağan konuşuyorsa başımız beladadır ve saat 7'den önce veya 20'den sonra ise başımız beladadır. 
	 * Başımız beladaysa true döner.
	 */

	// option 1
	public static boolean parrotTroubleMethod(boolean talking, int hour) {
		if (talking && hour < 7 || talking && hour > 20) {
			return true;
		} else {
			return false;
		}
	}

	// option 2
	public static boolean parrotTroubleMethod2(boolean talking, int hour) {
		return talking && hour < 7 || talking && hour > 20;
	}
}
