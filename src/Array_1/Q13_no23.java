package Array_1;

public class Q13_no23 {

	public static void main(String[] args) {
		int nums[] = { 4, 2 };
		System.out.println(Q13_no23.no23(nums));

	}

	/**
	 * Given an int array length 2, return true if it does not contain a 2 or 3.
	 * 
	 * no23([4, 5]) → true
	 * no23([4, 2]) → false
	 * no23([3, 5]) → false
	 */

	/**TR
	 * Uzunluğu 2  olan bir int dizi verildiğinde, 2 veya 3 içermiyorsa true değerini döndürür.
	 * 
	 * no23([4, 5]) → true
	 * no23([4, 2]) → false
	 * no23([3, 5]) → false
	 */

	public static boolean no23(int[] nums) {
		if (nums[0] == 2 || nums[1] == 3 || nums[0] == 3 || nums[1] == 2)
			return false;
		else
			return true;
	}
}
