class Solution {
    int[] values;
    int[][] dp;

    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        this.values = values;

        dp = new int[n][n];
        for(int[] d : dp){
            Arrays.fill(d, -1);
        }

        return solve(0, n-1);
    }

    public int solve(int i, int j) {
        if (j - i < 2) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        int ans = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; ++k) {
            int cost = solve(i, k) + solve(k, j) + values[i]*values[j]*values[k];
            ans = Math.min(ans, cost);
        }

        return dp[i][j] = ans;
    }
}