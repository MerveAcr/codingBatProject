package Logic_1;

public class Q17_fizzString {

	public static void main(String[] args) {
		System.out.println(Q17_fizzString.fizzString("fib"));

	}

	/**
	 * Given a string str, if the string starts with "f" return "Fizz". 
	 * If the string ends with "b" return "Buzz". 
	 * If both the "f" and "b" conditions are true, return "FizzBuzz". 
	 * In all other cases, return the string unchanged. 
	 * 
	 * fizzString("fig") → "Fizz"
	 * fizzString("dib") → "Buzz"
	 * fizzString("fib") → "FizzBuzz"
	 */

	/** TR
	 * Bir dizge dizgesi verildiğinde, dizge "f" ile başlıyorsa "Fizz" döndürür. 
	 * Dize "b" ile bitiyorsa, "Buzz" döndürün. 
	 * Hem "f" hem de "b" koşulları doğruysa, "FizzBuzz" döndürün. 
	 * Diğer tüm durumlarda, dizeyi değiştirmeden döndürün.
	 * 
	 * fizzString("fig") → "Fizz"
	 * fizzString("dib") → "Buzz"
	 * fizzString("fib") → "FizzBuzz"
	 */

	public static String fizzString(String str) {
		if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
			return "FizzBuzz";
		} else if (str.charAt(0) == 'f') {
			return "Fizz";
		} else if (str.charAt(str.length() - 1) == 'b') {
			return "Buzz";
		} else {
			return str;
		}
	}

}
