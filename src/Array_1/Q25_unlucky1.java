package Array_1;

public class Q25_unlucky1 {

	public static void main(String[] args) {
		int nums[] = { 1, 3, 4, 5 };
		System.out.println(Q25_unlucky1.unlucky1(nums));
	}

	/**
	 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
	 * Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
	 * 
	 * unlucky1([1, 3, 4, 5]) → true
	 * unlucky1([2, 1, 3, 4, 5]) → true
	 * unlucky1([1, 1, 1]) → false
	 */

	/** TR
	 * Bir dizide 1'in hemen ardından gelen 3'ün "şanssız" 1 olduğunu söyleyeceğiz. 
	 * Verilen dizi, dizinin ilk 2'sinde veya son 2 konumunda şanssız 1'i içeriyorsa true değerini döndürün.
	 * 
	 * unlucky1([1, 3, 4, 5]) → true
	 * unlucky1([2, 1, 3, 4, 5]) → true
	 * unlucky1([1, 1, 1]) → false
	 */

	public static boolean unlucky1(int[] nums) {
		if (nums.length <= 1) {
			return false;
		} else if (nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3) {
			return true;
		} else if (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) {
			return true;
		} else {
			return false;
		}
	}

}
