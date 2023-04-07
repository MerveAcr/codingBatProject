package Logic_1;

public class Q03_squirrelPlay {

	public static void main(String[] args) {
		System.out.println(Q03_squirrelPlay.squirrelPlay(70, false));

	}

	/**
	 * The squirrels in Palo Alto spend most of the day playing. 
	 * In particular, they play if the temperature is between 60 and 90 (inclusive). 
	 * Unless it is summer, then the upper limit is 100 instead of 90. 
	 * Given an int temperature and a boolean isSummer, 
	 * return true if the squirrels play and false otherwise.
	 * 
	 * squirrelPlay(70, false) → true
	 * squirrelPlay(95, false) → false
	 * squirrelPlay(95, true) → true
	 */

	/**TR
	 * Palo Alto'daki sincaplar günün çoğunu oyun oynayarak geçirir. 
	 * Özellikle, sıcaklık 60 ile 90 (dahil) arasındaysa oynarlar. 
	 * Yaz olmadığı sürece, üst sınır 90 yerine 100'dür. 
	 * Bir int sıcaklık ve bir boolean isSummer olduğunda, sincaplar oynuyorsa true, 
	 * aksi takdirde false döndürün.
	 * 
	 * squirrelPlay(70, false) → true
	 * squirrelPlay(95, false) → false
	 * squirrelPlay(95, true) → true
	 */

	public static boolean squirrelPlay(int temp, boolean isSummer) {
		if (isSummer && temp >= 60 && temp <= 100)
			return true;
		else if (!isSummer && temp >= 60 && temp <= 90)
			return true;
		else
			return false;
	}

}
