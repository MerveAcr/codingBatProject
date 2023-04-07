package String_1;

public class Q02_makeAbba {

	public static void main(String[] args) {
		System.out.println(Q02_makeAbba.makeAbba("Hi", "Bye"));
	}

	/**
	 * Given two strings, a and b, 
	 * return the result of putting them together in the order abba, 
	 * e.g. "Hi" and "Bye" returns "HiByeByeHi".
	 * 
	 * makeAbba("Hi", "Bye") → "HiByeByeHi"
	 * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
	 * makeAbba("What", "Up") → "WhatUpUpWhat"
	 */

	/** TR
	 * Verilen iki dize, a ve b, 
	 * bunları abba sırasına göre bir araya getirmenin sonucunu döndürür, 
	 * örneğin "Hi" ve "Bye", "HiByeByeHi" döndürür.
	 * 
	 * makeAbba("Hi", "Bye") → "HiByeByeHi"
	 * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
	 * makeAbba("What", "Up") → "WhatUpUpWhat"
	 */

	public static String makeAbba(String a, String b) {
		return a + b + b + a;
	}

}
