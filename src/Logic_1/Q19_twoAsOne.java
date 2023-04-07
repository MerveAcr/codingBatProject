package Logic_1;

public class Q19_twoAsOne {
	public static void main(String[] args) {
		System.out.println(Q19_twoAsOne.twoAsOne(2, 3, 1));
	}

	/**
	 * Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
	 * 
	 * twoAsOne(1, 2, 3) → true
	 * twoAsOne(3, 1, 2) → true
	 * twoAsOne(3, 2, 2) → false
	 */

	/**TR
	 * Üç giriş verildiğinde, abc, üçüncüyü elde etmek için iki giriş eklemek mümkünse true değerini döndürür.
	 * 
	 * twoAsOne(1, 2, 3) → true
	 * twoAsOne(3, 1, 2) → true
	 * twoAsOne(3, 2, 2) → false
	 */

	public static boolean twoAsOne(int a, int b, int c) {
		if (a + b == c || a + c == b || b + c == a)
			return true;
		else
			return false;
	}
}
