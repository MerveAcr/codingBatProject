package Array_1;

public class Q23_maxTriple {

	public static void main(String[] args) {
		int nums[] = { 5, 2, 3 };
		System.out.println(Q23_maxTriple.maxTriple(nums));

	}

	/**
	 * Given an array of ints of odd length, look at the first, last, 
	 * and middle values in the array and return the largest. 
	 * The array length will be a least 1.
	 * 
	 * maxTriple([1, 2, 3]) → 3
	 * maxTriple([1, 5, 3]) → 5
	 * maxTriple([5, 2, 3]) → 5
	 */

	/** TR
	 * Tek uzunlukta bir dizi veri verildiğinde, dizideki ilk, 
	 * son ve orta değerlere bakın ve en büyüğünü döndürün. 
	 * Dizi uzunluğu en az 1 olacaktır.
	 * 
	 * maxTriple([1, 2, 3]) → 3
	 * maxTriple([1, 5, 3]) → 5
	 * maxTriple([5, 2, 3]) → 5
	 */

	public static int maxTriple(int[] nums) {
		if (nums[0] > nums[nums.length / 2] && nums[0] > nums[nums.length - 1]) {
			return nums[0];
		} else if (nums[nums.length / 2] > nums[nums.length - 1] && nums[nums.length / 2] > nums[0]) {
			return nums[nums.length / 2];
		} else {
			return nums[nums.length - 1];
		}
	}
}
