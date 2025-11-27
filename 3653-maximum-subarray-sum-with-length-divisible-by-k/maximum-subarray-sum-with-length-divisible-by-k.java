class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long[] prefix = new long[k];
        for (int i = 0; i < k; i++) {
            prefix[i] = Long.MAX_VALUE;
        }
        prefix[0] = 0;

        long res = Long.MIN_VALUE;
        long total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            int length = i + 1;
            int prefixLen = length % k;
            if (prefix[prefixLen] != Long.MAX_VALUE) {
                res = Math.max(res, total - prefix[prefixLen]);
            }
            prefix[prefixLen] = Math.min(prefix[prefixLen], total);
        }

        return res;
    }
}

// 1 2 3 4 5 6 7