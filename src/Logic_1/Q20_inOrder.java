package Logic_1;

public class Q20_inOrder {
	public static void main(String[] args) {
		System.out.println(Q20_inOrder.inOrder(2, 3, 4, false));
	}

	/**
	 * Given three ints, a b c, return true if b is greater than a, and c is greater than b. 
	 * However, with the exception that if "bOk" is true, b does not need to be greater than a.
	 * 
	 * inOrder(1, 2, 4, false) → true
	 * inOrder(1, 2, 1, false) → false
	 * inOrder(1, 1, 2, true) → true 
	 */

	/**TR
	 * Üç giriş verildiğinde, abc, eğer b, a'dan büyükse ve c, b'den büyükse true döndürür. 
	 * Ancak, "bOk" doğruysa, b'nin a'dan büyük olması gerekmez.
	 * 
	 * inOrder(1, 2, 4, false) → true
	 * inOrder(1, 2, 1, false) → false
	 * inOrder(1, 1, 2, true) → true 
	 */

	public static boolean inOrder(int a, int b, int c, boolean bOk) {
		if (c > b && bOk)
			return true;
		if (b > a && c > b)
			return true;
		else
			return false;
	}
}
