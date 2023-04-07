package Warmup_1;

public class Q02_monkeyTrouble {

	public static void main(String[] args) {
		System.out.println(Q02_monkeyTrouble.monkeyTroubleMethod1(false, false));

	}

	/**
	 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
	 * We are in trouble if they are both smiling or if neither of them is smiling. 
	 * Return true if we are in trouble.
	 * Example:
	 * monkeyTrouble(true, true) → true
	 * monkeyTrouble(false, false) → true
	 * monkeyTrouble(true, false) → false
	 */

	/** TR
	 * İki maymunumuz var, a ve b. 
	 * aSmile ve bSmile parametreleri her birinin gülümseyip gülümsemediğini gösteriyor. 
	 * İkisi de gülüyorsa ya da ikisi de gülmüyorsa başımız belaya girer. 
	 * Başımız beladaysa true döndür!
	 * Ornek:
	 * monkeyTrouble(true, true) → true
	 * monkeyTrouble(false, false) → true
	 * monkeyTrouble(true, false) → false
	 */

	//option 1:
	public static boolean monkeyTroubleMethod1(boolean aSmile, boolean bSmile) {
		if (aSmile && bSmile) {
			return true;
		}
		if (!aSmile && !bSmile) {
			return true;
		}
		return false;
	}

	//option 2:
	public static boolean monkeyTroubleMethod2(boolean aSmile, boolean bSmile) {
		if (aSmile && bSmile || !aSmile && !bSmile) {
			return true;
		} else {
			return false;
		}
	}

	//option 3:
	public static boolean monkeyTroubleMethod3(boolean aSmile, boolean bSmile) {
		return (aSmile == bSmile);
	}

}
