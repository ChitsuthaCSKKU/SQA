package sqa.main;

public class CountWordClumps {
	
	public static int countClumps(int[] nums) {
		//Line1
		if (nums == null || nums.length == 0) {
			//Line2
			return 0;
		}
		//Line3
		int count = 0;
		int prev = nums[0];
		boolean inClump = false;
		//Line4
		for (int i = 1; i < nums.length; i++) {
			//Line5
			if (nums[i] == prev && !inClump) {
				//Line6
				inClump = true;
				count += 1;
			}
			//Line7
			if (nums[i] != prev) {
				//Line8
				prev = nums[i];
				inClump = false;
			}
		}
			//Line9
			return count;
	}

}
