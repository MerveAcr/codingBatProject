package Logic_1;

public class Q18_fizzString2 {

	public static void main(String[] args) {
		System.out.println(Q18_fizzString2.fizzString2(15));
	}

	/**
	 * Given an int n, return the string form of the number followed by "!". 
	 * So the int 6 yields "6!". 
	 * Except if the number is divisible by 3 use "Fizz" instead of the number, 
	 * and if the number is divisible by 5 use "Buzz", 
	 * and if divisible by both 3 and 5, use "FizzBuzz". 
	 * Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3. 
	 * What will the remainder be when one number divides evenly into another?
	 * 
	 * fizzString2(1) → "1!"
	 * fizzString2(2) → "2!"
	 * fizzString2(3) → "Fizz!"
	 */

	/**TR
	 * Bir int n verildiğinde, ardından "!" ile gelen sayının dize biçimini döndürün. 
	 * Yani int 6 "6!" verir. 
	 * Sayı 3'e bölünüyorsa sayı yerine "Fizz", 
	 * 5'e bölünüyorsa "Buzz", hem 3'e hem de 5'e bölünebiliyorsa "FizzBuzz" kullanın. 
	 * Not: % "mod" operatörü bölmeden sonra kalanı hesaplar, bu nedenle %23 10 3 verir. 
	 * Bir sayı diğerine eşit olarak bölündüğünde kalan ne olur?
	 * 
	 * fizzString2(1) → "1!"
	 * fizzString2(2) → "2!"
	 * fizzString2(3) → "Fizz!"
	 */

	public static String fizzString2(int n) {
		if (n % 3 == 0 && n % 5 == 0)
			return "FizzBuzz!";
		else if (n % 3 == 0)
			return "Fizz!";
		else if (n % 5 == 0)
			return "Buzz!";
		else
			return n + "!";
	}
}
