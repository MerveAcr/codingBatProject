package Logic_1;

public class Q15_answerCell {

	public static void main(String[] args) {
		System.out.println(Q15_answerCell.answerCell(false, false, false));
	}

	/**
	 *Your cell phone rings. Return true if you should answer it. 
	 *Normally you answer, except in the morning you only answer if it is your mom calling. 
	 *In all cases, if you are asleep, you do not answer.
	 *
	 * answerCell(false, false, false) → true
	 * answerCell(false, false, true) → false
	 * answerCell(true, false, false) → false
	 */

	/**TR
	 * Cep telefonunuz çalar. Cevaplamanız gerekiyorsa true döndürün. 
	 * Normalde cevap verirsin, ancak sabahları sadece annen arıyorsa cevap verirsin. 
	 * Her durumda, eğer uyuyorsan, cevap vermiyorsun.
	 * 
	 * answerCell(false, false, false) → true
	 * answerCell(false, false, true) → false
	 * answerCell(true, false, false) → false
	 */

	public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isMorning && isMom && !isAsleep)
			return true;
		else if (!isMorning && !isMom && !isAsleep)
			return true;
		else if (!isMorning && isMom && !isAsleep)
			return true;
		else
			return false;
	}
}
