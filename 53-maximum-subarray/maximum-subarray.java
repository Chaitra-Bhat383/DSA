class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, res = Integer.MIN_VALUE;
        for(int num : nums) {
            sum = sum + num;
            res = Math.max(res, sum);
            if(sum < 0) {
                sum = 0;
            }
        }
        return res;
    }
}