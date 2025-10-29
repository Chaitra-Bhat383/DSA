class Solution {
    public int smallestNumber(int n) {
        // 2 ^ n - 1
        int ans = 1;
        while (ans <= n) {
            ans = ans << 1;
        }
        return ans - 1;
    }
}