class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int num1 = 0;
        int g = 0;
        for (int num : nums) {
            if (num == 1) {
                num1++;
            }
            g = gcd(g, num);
        }
        if (num1 > 0) {
            return n - num1;
        }
        if (g > 1) {
            return -1;
        }

        int minLen = n;
        for (int i = 0; i < n; ++i) {
            int curGcd = 0;
            for (int j = i; j < n; ++j) {
                curGcd = gcd(curGcd, nums[j]);
                if (curGcd == 1) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }
        return minLen + n - 2;
    }


    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}