package Warmup_1;

public class Q01_sleepIn {

	public static void main(String[] args) {
		System.out.println(Q01_sleepIn.sleepInMethod1(false, false));

	}

	/** 
	 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
	 * We sleep in if it is not a weekday or we're on vacation. 
	 * Return true if we sleep in.
	 * sleepIn(false, false) → true
	 * sleepIn(true, false) → false
	 * sleepIn(false, true) → true
	 */

	/** TR 
	 * Hafta içi parametresi hafta içi ise doğrudur ve tatil parametresi biz tatildeysek doğrudur. 
	 * Hafta içi değilse veya tatildeysek uyuruz. 
	 * Uyursak true döner.
	 * sleepIn(false, false) → true
	 * sleepIn(true, false) → false
	 * sleepIn(false, true) → true
	 */

	//option 1:
	public static boolean sleepInMethod1(boolean weekday, boolean vacation) {
		if (vacation) {
			return true;
		} else if (!weekday) {
			return true;
		} else {
			return false;
		}
	}

	//option 2:
	public static boolean sleepInMethod2(boolean weekday, boolean vacation) {
		if (!weekday || vacation) {
			return true;
		} else {
			return false;
		}
	}

	// option 3:
	public static boolean sleepInMethod3(boolean weekday, boolean vacation) {
		return (!weekday || vacation);
	}

	// Solution Notes:
	// Better to write "vacation" than "vacation == true"
	// Though they mean exactly the same thing
	// Likewise "!weekday"is better than  "weekday == false" 
	// This all can be shortened to: return (!weekday || vacation);
	// Here we just put the return- false last, or could use an if/else
	//
	//**********************************************************************
	//
	// Çözüm notları: 
	// "vacation" yazmak, "vacation == true" yazmaktan daha iyidir.
	// Tamamen aynı anlama geliyorlar.Ancak sadece "vacation" yazmak tercih edilmelidir.
	// Aynı şekilde "!weekday", "weekday == false" yazmanktan daha iyidir.
	// Bunların tümü şu şekilde kısaltılabilir: return (!weekday || vacation);
	// Burada sadece return-false'ı en sona koyuyoruz veya bir if/else kullanabiliriz.

}
