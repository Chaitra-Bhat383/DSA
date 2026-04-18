class Solution {
    public int mirrorDistance(int n) {
        int m = reverse(n);
        return Math.abs(n - m);
    }

    public int reverse(int n) {
        int k = 0;
        while (n > 0) {
            k = 10 * k + (n % 10);
            n = n / 10;
        }
        return k;
    }
}