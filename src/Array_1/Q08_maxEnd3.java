package Array_1;

import java.util.Arrays;

public class Q08_maxEnd3 {

	public static void main(String[] args) {
		int nums[] = { 2, 11, 3 };
		System.out.println(Arrays.toString(Q08_maxEnd3.maxEnd3(nums)));

	}

	/**
	 * Given an array of ints length 3, 
	 * figure out which is larger, the first or last element in the array, 
	 * and set all the other elements to be that value. 
	 * Return the changed array.
	 * 
	 * maxEnd3([1, 2, 3]) → [3, 3, 3]
	 * maxEnd3([11, 5, 9]) → [11, 11, 11]
	 * maxEnd3([2, 11, 3]) → [3, 3, 3]
	 */

	/**TR
	 * Uzunluğu 3 olan bir dizi verildiğinde, 
	 * hangisinin daha büyük olduğunu, dizideki ilk veya son öğeyi bulun 
	 * ve diğer tüm öğeleri bu değere ayarlayın. 
	 * Değiştirilen diziyi döndürün.
	 * 
	 * maxEnd3([1, 2, 3]) → [3, 3, 3]
	 * maxEnd3([11, 5, 9]) → [11, 11, 11]
	 * maxEnd3([2, 11, 3]) → [3, 3, 3]
	 */

	public static int[] maxEnd3(int[] nums) {
		int[] nums1 = new int[3];
		for (int i = 0; i < nums.length; i++) {
			if (nums[0] > nums[2]) {
				nums1[i] = nums[0];
			} else if (nums[2] > nums[0]) {
				nums1[i] = nums[2];
			} else {
				nums1[i] = nums[0];
			}
		}
		return nums1;
	}
}
