package main;

public class CountClump {
	
	public static int countClumps(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		
		int count = 0;
		int prev = nums[0];
		boolean inClump = false;
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == prev && !inClump) {
				inClump = true;
				count += 1;
			}
		
			if (nums[i] != prev) {
				prev = nums[i];
				inClump = false;
			}
		}
			return count;
	}
}
