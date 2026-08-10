class Solution {
    Boolean[] dp;

    public boolean bestScore(int i){
        if (i == 1) return true;
        if (i == 0) return false;
        if (dp[i] != null) return dp[i];
        for(int x = 1; x * x <= i ; x++) {
            int sq = x * x;
            if(!bestScore(i - sq)) return dp[i] = true;
        }
        return dp[i] = false;
    }

    public boolean winnerSquareGame(int n) {
        dp = new Boolean[n + 1];
        return bestScore(n);
    }
}
