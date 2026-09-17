class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int ans = Integer.MAX_VALUE, minLength = Integer.MAX_VALUE;
        int[] best = new int[arr.length];
        Arrays.fill(best, Integer.MAX_VALUE);
        int j = 0, sum = 0, prevIndex = -1;
        for(int i = 0; i < arr.length; ++i) {
            sum += arr[i];
            while(sum > target) {
                sum -= arr[j];
                j++;
            }
            if(sum == target) {
                if(j > 0 && best[j - 1] != Integer.MAX_VALUE) {
                    ans = Math.min(ans, i - j + 1 + best[j - 1]);
                }
                minLength = Math.min(minLength, i - j + 1);
            }
            best[i] = minLength;
        }
        if (ans != Integer.MAX_VALUE) return ans;
        return -1;
    }
}