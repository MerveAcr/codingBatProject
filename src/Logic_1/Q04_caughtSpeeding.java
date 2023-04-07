package Logic_1;

public class Q04_caughtSpeeding {

	public static void main(String[] args) {
		System.out.println(Q04_caughtSpeeding.caughtSpeeding(85, false));
	}

	/**
	 * You are driving a little too fast, and a police officer stops you. 
	 * Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
	 * If speed is 60 or less, the result is 0. 
	 * If speed is between 61 and 80 inclusive, the result is 1. 
	 * If speed is 81 or more, the result is 2. 
	 * Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
	 * 
	 * caughtSpeeding(60, false) → 0
	 * caughtSpeeding(65, false) → 1
	 * caughtSpeeding(65, true) → 0
	 */

	/** TR
	 * Biraz fazla hızlı sürüyorsunuz ve bir polis memuru sizi durduruyor. 
	 * Sonucu hesaplamak için bir int değeri olarak kodlanmış kod yazın: 0=bilet yok, 1=küçük bilet, 2=büyük bilet. 
	 * Hız 60 veya daha az ise sonuç 0'dır. 
	 * Hız 61 ile 80 arasındaysa sonuç 1'dir. 
	 * Hız 81 veya daha fazla ise sonuç 2'dir. 
	 * hız her durumda 5 daha yüksek olabilir.
	 * 
	 * caughtSpeeding(60, false) → 0
	 * caughtSpeeding(65, false) → 1
	 * caughtSpeeding(65, true) → 0
	 */

	public static int caughtSpeeding(int speed, boolean isBirthday) {
		if (isBirthday) {
			if (speed <= 65) {
				return 0;
			} else if (speed >= 66 && speed <= 85) {
				return 1;
			} else {
				return 2;
			}
		} else {
			if (speed <= 60) {
				return 0;
			} else if (speed >= 61 && speed <= 80) {
				return 1;
			} else {
				return 2;
			}
		}
	}

}
