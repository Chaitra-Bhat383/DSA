// RECURSION - TLE
// class Solution {
//     public int func(int ind) {
//         if(ind == 1) return 1;
//         if(ind == 0) return 1;
//         return func(ind - 1) + func(ind-2);
//     } 

//     public int climbStairs(int n) {
//         return func(n);
//     }
// }

// MEMOIZATION - TOP DOWN
// class Solution {
//     int[] dp;

//     public int func(int ind) {
//         if(ind == 1) return 1;
//         if(ind == 0) return 1;

//         if (dp[ind] != -1) {
//             return dp[ind];
//         }

//         return dp[ind] = func(ind - 1) + func(ind-2);
//     } 

//     public int climbStairs(int n) {
//         dp = new int[n + 1];
//         Arrays.fill(dp, -1);
//         return func(n);
//     }
// }

// TABULATION BOTTOM UP
class Solution {
    int[] dp;

    // public int func(int ind) {
    //     if(ind == 1) return 1;
    //     if(ind == 0) return 1;

    //     if (dp[ind] != -1) {
    //         return dp[ind];
    //     }

    //     return dp[ind] = func(ind - 1) + func(ind-2);
    // } 

    public int climbStairs(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; ++i) {
            dp[i] = dp[i - 1] + dp[i-2];
        }
        return dp[n];
    }
}