class Solution {
    Boolean[][] dp;

    public boolean canPartition(int[] nums) {
        int target = 0;
        for(int num : nums) {
            target += num;
        }
        if(target % 2 != 0) return false;
        dp = new Boolean[nums.length][target/2 + 1];
        return f(0, nums, target/2);
    }

    public boolean f(int index, int[] nums, int target) {
        if(index == nums.length) {
            if(target == 0) {
                return true;
            }
            return false;
        }
        if (dp[index][target] != null) return dp[index][target];
        boolean pick = false;
        if(nums[index] <= target) {
            pick = f(index + 1, nums, target - nums[index]);
        }
        boolean notpick = f(index + 1, nums, target);
        return dp[index][target] = pick || notpick;
    }
}