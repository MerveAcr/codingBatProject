package Warmup_1;

public class Q23_startOz {

	public static void main(String[] args) {
		System.out.println(Q23_startOz.startOz("oxx"));

	}

	/**
	 * Given a string, return a string made of the first 2 chars (if present), 
	 * however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
	 * 
	 * startOz("ozymandias") → "oz"
	 * startOz("bzoo") → "z"
	 * startOz("oxx") → "o"
	 */

	/** TR
	 * Bir dize verildiğinde, ilk 2 karakterden (varsa) oluşan bir dize döndürün,
	 * ancak ilk karakteri yalnızca 'o' ise ve ikincisini yalnızca 'z' ise dahil edin, bu nedenle "ozymandias", "oz" verir.
	 * 
	 * startOz("ozymandias") → "oz"
	 * startOz("bzoo") → "z"
	 * startOz("oxx") → "o"
	 */

	public static String startOz(String str) {
		String result = "";
		if (str.length() >= 1 && str.charAt(0) == 'o') {
			result = result + str.charAt(0);
		}
		if (str.length() >= 2 && str.charAt(1) == 'z') {
			result = result + str.charAt(1);
		}
		return result;
	}
}
