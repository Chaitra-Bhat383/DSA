// class Solution {
//     Integer[] dp;
//     public int diffScore(int[] nums, int i, int n){
//         if (i > n) return 0;
//         if (dp[i] != null) return dp[i];
//         // int bobOption1 = Math.min(Math.min(bestScore(nums, i + 2, n), bestScore(nums, i + 3, n)), bestScore(nums, i + 4, n));
//         // int bobOption2 = Math.min(Math.min(bestScore(nums, i + 3, n), bestScore(nums, i + 4, n)), bestScore(nums, i + 5, n));
//         // int bobOption3 = Math.min(Math.min(bestScore(nums, i + 4, n), bestScore(nums, i + 5, n)), bestScore(nums, i + 6, n));
//         int option1 = nums[i] - diffScore(nums, i + 1, n);
//         int option2 = Integer.MIN_VALUE;
//         int option3 = Integer.MIN_VALUE;
//         if (i + 1 <= n) {
//             option2 = nums[i] + nums[i + 1] - diffScore(nums, i + 2, n);
//         }
//         if (i + 2 <= n) {
//             option3 = nums[i] + nums[i + 1] + nums[i + 2] - diffScore(nums, i + 3, n);
//         }
//         return dp[i] = Math.max(Math.max(option1, option2), option3);
//     }

//     public String stoneGameIII(int[] stoneValue) {
//         int n = stoneValue.length;
//         int totalScore = 0;
//         dp = new Integer[n];
//         int p1 = diffScore(stoneValue, 0, n - 1);
//         if (p1 > 0) return "Alice";
//         if (p1 < 0) return "Bob";
//         else return "Tie";
//     }
// }

class Solution {
    Integer[] dp;
    public int bestScore(int[] nums, int i, int n) {
        if (i > n)
            return 0;
        if (dp[i] != null)
            return dp[i];
        int bobOption1 = Math.min(Math.min(bestScore(nums, i + 2, n),bestScore(nums, i + 3, n)),bestScore(nums, i + 4, n));
        int bobOption2 = Integer.MAX_VALUE;
        bobOption2 = Math.min(Math.min(bestScore(nums, i + 3, n),bestScore(nums, i + 4, n)),bestScore(nums, i + 5, n));
        int bobOption3 = Integer.MAX_VALUE;
        bobOption3 = Math.min(Math.min(bestScore(nums, i + 4, n),bestScore(nums, i + 5, n)),bestScore(nums, i + 6, n));

        int option1 = nums[i] + bobOption1;
        int option2 = Integer.MIN_VALUE;
        if (i + 1 <= n) {
            option2 = nums[i] + nums[i + 1] + bobOption2;
        }
        int option3 = Integer.MIN_VALUE;
        if (i + 2 <= n) {
            option3 = nums[i] + nums[i + 1] + nums[i + 2] + bobOption3;
        }

        return dp[i] = Math.max(Math.max(option1, option2),option3);
    }


    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        dp = new Integer[n];
        int p1 = bestScore(stoneValue, 0, n - 1);
        int total = 0;
        for (int x : stoneValue)
            total += x;
        int p2 = total - p1;
        if (p1 > p2) return "Alice";
        if (p1 < p2) return "Bob";
        return "Tie";
    }
}