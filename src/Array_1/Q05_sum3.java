package Array_1;

public class Q05_sum3 {

	public static void main(String[] args) {
		int nums[] = { 2, 6, 7 };
		System.out.println(Q05_sum3.sum3(nums));
	}

	/**
	 * Given an array of ints length 3, return the sum of all the elements.
	 * 
	 * sum3([1, 2, 3]) → 6
	 * sum3([5, 11, 2]) → 18
	 * sum3([7, 0, 0]) → 7
	 */

	/**TR
	 * Uzunluğu 3 olan bir dizi verildiğinde, tüm öğelerin toplamını döndürün.
	 * 
	 * sum3([1, 2, 3]) → 6
	 * sum3([5, 11, 2]) → 18
	 * sum3([7, 0, 0]) → 7
	 */

	public static int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];
	}
}
