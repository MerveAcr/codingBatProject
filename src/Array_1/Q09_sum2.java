package Array_1;

public class Q09_sum2 {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3 };
		System.out.println(Q09_sum2.sum2(nums));

	}

	/**
	 * Given an array of ints, return the sum of the first 2 elements in the array. 
	 * If the array length is less than 2, just sum up the elements that exist, 
	 * returning 0 if the array is length 0.
	 * 
	 * sum2([1, 2, 3]) → 3
	 * sum2([1, 1]) → 2
	 * sum2([1, 1, 1, 1]) → 2
	 */

	/**TR
	 * Bir dizi int degeri verildiğinde, dizideki ilk 2 öğenin toplamını döndürür. 
	 * Dizi uzunluğu 2'den küçükse, var olan öğeleri toplayın, 
	 * dizinin uzunluğu 0 ise 0 döndürün.
	 * 
	 * sum2([1, 2, 3]) → 3
	 * sum2([1, 1]) → 2
	 * sum2([1, 1, 1, 1]) → 2
	 */

	public static int sum2(int[] nums) {
		if (nums.length >= 2) {
			return nums[0] + nums[1];
		} else if (nums.length == 0) {
			return 0;
		} else {
			return nums[0];
		}
	}

}
