class Solution {
    public int countPartitions(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            nums[i + 1] += nums[i];
        }
        int end = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; --i) {
            if (((2 * nums[i] - end) % 2) == 0) {
                ans++;
            }
        }
        return ans;
    }
}



// 10 20 23 30 36


// 36 26 16 13 6