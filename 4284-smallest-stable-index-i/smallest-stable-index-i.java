class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] mini = new int[nums.length];
        int[] maxi = new int[nums.length];
        int maxiNum = Integer.MIN_VALUE;
        int miniNum = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; ++i) {
            maxiNum = Math.max(maxiNum, nums[i]);
            maxi[i] = maxiNum;
        }
        for(int i = nums.length - 1; i >= 0; --i) {
            miniNum = Math.min(miniNum, nums[i]);
            mini[i] = miniNum;
        }
        for(int i = 0; i < nums.length; ++i) {
            if(maxi[i] - mini[i] <= k) return i; 
        }
        return -1;
    }
}