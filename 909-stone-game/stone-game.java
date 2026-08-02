class Solution {
    Integer[][] dp;
    public int bestScore(int[] nums, int i, int n){
        if (i == n) return nums[i];
        if (i > n) return 0;
        if (dp[i][n] != null) return dp[i][n];
        int option1 = nums[i] + Math.min(bestScore(nums, i + 2, n), bestScore(nums, i + 1, n - 1));
        int option2 = nums[n] + Math.min(bestScore(nums, i, n - 2), bestScore(nums, i + 1, n - 1));
        return dp[i][n] = Math.max(option1, option2);
    }

    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int totalScore = 0;
        dp = new Integer[n][n];
        int p1 = bestScore(piles, 0, n - 1);
        for (int i = 0; i < n; ++i) {
            totalScore += piles[i];
        }
        int p2 = totalScore - p1;
        if (p1 >= p2) return true;
        else return false;
    }
}