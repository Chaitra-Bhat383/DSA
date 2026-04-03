// class Solution {

//     public int solve(int ind, int prevInd, int[] nums, int n, int[][] dp) {
//         if (ind == n) {
//             return 0;
//         }
//         if (dp[ind][prevInd + 1] != -1) {
//             return dp[ind][prevInd + 1];
//         }
//         int len = solve(ind + 1, prevInd, nums, n, dp);
//         if (prevInd == -1 || nums[ind] > nums[prevInd]) {
//             len = Math.max(len, 1 + solve(ind + 1, ind, nums, n, dp));
//         }
//         return dp[ind][prevInd + 1] = len;
//     }

//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length;
//         int[][] dp = new int[n][n + 1];
//         for (int i = 0; i < n; i++) {
//             Arrays.fill(dp[i], -1);
//         }
//         return solve(0, -1, nums, n, dp);
//     }
// }
class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> lis = new ArrayList<>();

        for(int num : nums){
            int pos = lowerBound(lis, num);
            if(pos == lis.size()) {
                lis.add(num);
            } else {
                lis.set(pos, num);
            }
        }

        return lis.size();
    }

    public int lowerBound(List<Integer> nums, int target) {
        int l = 0;
        int r = nums.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if(nums.get(mid) >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}