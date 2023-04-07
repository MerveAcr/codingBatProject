package Logic_1;

public class Q06_alarmClock {

	public static void main(String[] args) {
		System.out.println(Q06_alarmClock.alarmClock(0, false));
	}

	/**
	 * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, 
	 * and a boolean indicating if we are on vacation, 
	 * return a string of the form "7:00" indicating when the alarm clock should ring. 
	 * Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". 
	 * Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
	 * 
	 * alarmClock(1, false) → "7:00"
	 * alarmClock(5, false) → "7:00"
	 * alarmClock(0, false) → "10:00"
	 */

	/**TR
	 * 0=Paz, 1=Pzt, 2=Sa, ...6=Cts olarak kodlanmış haftanın bir günü 
	 * ve tatilde olup olmadığımızı gösteren bir boole değeri verildiğinde, 
	 * "7:00" biçiminde bir dize döndürün. çalar saat çalmalıdır. 
	 * Hafta içi alarm "7:00", hafta sonu ise "10:00" olmalıdır. 
	 * Tatilde değilsek -- o zaman hafta içi "10:00" ve hafta sonları "kapalı" olmalıdır.
	 * 
	 * alarmClock(1, false) → "7:00"
	 * alarmClock(5, false) → "7:00"
	 * alarmClock(0, false) → "10:00"
	 */

	public static String alarmClock(int day, boolean vacation) {
		if (vacation) {
			if (day == 0 || day == 6) {
				return "off";
			} else {
				return "10:00";
			}
		} else if (day == 0 || day == 6 && !vacation) {
			return "10:00";
		} else {
			return "7:00";
		}
	}

}
