class Solution {
    public int countCommas(int n) {
        if(n == 100000) return 99001;
        else if(n >= 10000 && n < 100000) {
            return n - 10000 + 1 + 9000;
        } else if(n >= 1000 && n < 10000) {
            return n - 1000 + 1;
        } else return 0;
    }
}