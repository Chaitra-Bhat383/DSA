class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return f(0, nums, target);
    }

    public int f(int index, int[] nums, int target) {
        if(index == nums.length) {
            if(target == 0) {
                return 1;
            }
            return 0;
        }

        int plus = f(index + 1, nums, target + nums[index]);
        int minus = f(index + 1, nums, target - nums[index]);
        return plus + minus;
    }
}