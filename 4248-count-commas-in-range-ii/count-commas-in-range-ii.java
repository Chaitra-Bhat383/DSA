class Solution {
    public long countCommas(long n) {
        if (n < 1000) return 0;
        else if (n < 1000000) return n - 999;
        else if (n < 1000000000) return (n - 999999) + (n - 999);
        else if (n < 1000000000000L) return (n - 999999999) + (n - 999999) + (n - 999);
        else if (n < 1000000000000000L) return (n - 999999999999L) + (n - 999999999) + (n - 999999) + (n - 999);
        else return (n - 999999999999999L) + (n - 999999999999L) + (n - 999999999) + (n - 999999) + (n - 999);
    }
}