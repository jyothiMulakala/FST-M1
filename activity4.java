package activity;

import java.util.Arrays;

public class activity4 {

	public static void main(String[] args) {
		
		activity4 actobj= new activity4();
		// Create unsorted array 
		int[]nums = {10, 20, 3, 5,1};
		actobj.insertionsort(nums);

	
		System.out.println("sorted array :"+ Arrays.toString(nums));
		

	}

	public void insertionsort(int[] nums) {
		int size = nums.length;
		for (int i = 1; i < size; i++) {
			int key = nums[1];
			int j = i - 1;

			while (j > 0 && key < nums[j]) {
				nums[j + 1] = nums[j];
				--j;
			}

			nums[j + 1] = key;

		}

	}

}
