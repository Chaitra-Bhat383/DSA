class Solution {
    public int arrayPairSum(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        // 1 2 3 4
        // 1 2 2 5 6 6
        for(int i = 0; i < nums.length; i = i + 2) {
            ans += nums[i];
        }
        return ans;
    }
}