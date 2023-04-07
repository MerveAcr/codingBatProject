package Logic_1;

public class Q30_sumLimit {
	public static void main(String[] args) {
		System.out.println(Q30_sumLimit.sumLimit(8, 1));
	}

	/**
	 * Given 2 non-negative ints, a and b, return their sum, 
	 * so long as the sum has the same number of digits as a. 
	 * If the sum has more digits than a, just return a without b. 
	 * (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string 
	 * with String.valueOf(n) and then check the length of the string.)
	 * 
	 * sumLimit(2, 3) → 5
	 * sumLimit(8, 3) → 8
	 * sumLimit(8, 1) → 9
	 */

	/**TR
	 * Negatif olmayan 2 girdi (a ve b) verildiğinde, 
	 * toplamın basamağı a ile aynı sayıda olduğu sürece toplamlarını döndürür. 
	 * Toplamda a'dan daha fazla basamak varsa, b olmadan a'yı döndürmeniz yeterlidir. 
	 * (Not: negatif olmayan bir int n'nin basamak sayısını hesaplamanın bir yolu, 
	 * onu String.valueOf(n) ile bir dizgeye dönüştürmek ve sonra dizgenin uzunluğunu kontrol etmektir.)
	 * 
	 * sumLimit(2, 3) → 5
	 * sumLimit(8, 3) → 8
	 * sumLimit(8, 1) → 9
	 */

	public static int sumLimit(int a, int b) {
		String aString = String.valueOf(a);
		String sumString = String.valueOf(a + b);
		if (sumString.length() > aString.length())
			return a;
		else
			return a + b;
	}
}
