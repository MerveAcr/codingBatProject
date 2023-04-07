package Warmup_1;

public class Q07_nearHundred {

	public static void main(String[] args) {
		System.out.println(Q07_nearHundred.nearHundredMethod(98));
	}

	/**
	 * Given an int n, return true if it is within 10 of 100 or 200. 
	 * Note: Math.abs(num) computes the absolute value of a number.
	 * 
	 * nearHundred(93) → true
	 * nearHundred(90) → true
	 * nearHundred(89) → false
	 */

	/** TR
	 * Bir int n verildiğinde, 100 veya 200'ün 10'u içindeyse true değerini döndürür.
	 * Not: Math.abs(num) bir sayının mutlak değerini hesaplar.
	 * 
	 * nearHundred(93) → true
	 * nearHundred(90) → true
	 * nearHundred(89) → false
	 */

	public static boolean nearHundredMethod(int n) {
		return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
	}
}
