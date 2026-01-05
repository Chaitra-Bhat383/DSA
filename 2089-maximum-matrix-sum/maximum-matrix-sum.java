class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long ans = 0;
        int minAbsVal = Integer.MAX_VALUE;
        int negCount = 0;

        for (int[] row : matrix) {
            for (int val : row) {
                ans += Math.abs(val);
                if (val < 0) {
                    negCount++;
                }
                minAbsVal = Math.min(minAbsVal, Math.abs(val));
            }
        }

        if (negCount % 2 != 0) {
            ans -= 2 * minAbsVal;
        }

        return ans;
    }
}