package Warmup_2;

public class Q15_array667 {

	public static void main(String[] args) {
		int array[] = { 6, 6, 2, 6, 7 };
		System.out.println(Q15_array667.array667(array));
	}

	/**
	 * Given an array of ints, 
	 * return the number of times that two 6's are next to each other in the array. 
	 * Also count instances where the second "6" is actually a 7.
	 * 
	 * array667([6, 6, 2]) → 1
	 * array667([6, 6, 2, 6]) → 1
	 * array667([6, 7, 2, 6]) → 1
	 */

	/**TR
	 * Bir int dizisi verildiğinde, 
	 * dizide iki 6'nın yan yana olma sayısını döndürür. 
	 * Ayrıca ikinci "6"nın aslında 7 olduğu durumları da sayın.
	 * 
	 * array667([6, 6, 2]) → 1
	 * array667([6, 6, 2, 6]) → 1
	 * array667([6, 7, 2, 6]) → 1
	 */

	public static int array667(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 6 && nums[i + 1] == 6 || nums[i] == 6 && nums[i + 1] == 7) {
				count++;
			}
		}
		return count;
	}

}
