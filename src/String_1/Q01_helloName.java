package String_1;

public class Q01_helloName {

	public static void main(String[] args) {
		System.out.println(Q01_helloName.helloName("john"));
	}

	/**
	 * Given a string name, 
	 * e.g. "Bob", return a greeting of the form "Hello Bob!".
	 * 
	 * helloName("Bob") → "Hello Bob!"
	 * helloName("Alice") → "Hello Alice!"
	 * helloName("X") → "Hello X!"
	 * 
	 */

	/** TR
	 * Bir dize adı verildiğinde, 
	 * örneğin "Bob", "Merhaba Bob!" biçiminde bir selamlama döndürün.
	 * 
	 * helloName("Bob") → "Hello Bob!"
	 * helloName("Alice") → "Hello Alice!"
	 * helloName("X") → "Hello X!"
	 */

	public static String helloName(String name) {
		return "Hello " + name + "!";
	}

}
