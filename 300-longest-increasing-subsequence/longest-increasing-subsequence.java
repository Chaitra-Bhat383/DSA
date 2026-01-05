class Solution {

    public int solve(int ind, int prevInd, int[] nums, int n, int[][] dp) {
        if (ind == n) {
            return 0;
        }
        if (dp[ind][prevInd + 1] != -1) {
            return dp[ind][prevInd + 1];
        }
        int len = solve(ind + 1, prevInd, nums, n, dp);
        if (prevInd == -1 || nums[ind] > nums[prevInd]) {
            len = Math.max(len, 1 + solve(ind + 1, ind, nums, n, dp));
        }
        return dp[ind][prevInd + 1] = len;
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(0, -1, nums, n, dp);
    }
}