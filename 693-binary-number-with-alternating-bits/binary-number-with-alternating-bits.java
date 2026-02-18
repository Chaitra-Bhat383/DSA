class Solution {
    public boolean hasAlternatingBits(int n) {
        int curr = 0, prev = Integer.MAX_VALUE;
        while(n > 0) {
            curr = n & 1;
            //System.out.println(curr);
            if (prev != Integer.MAX_VALUE && prev == curr) return false;
            prev = curr;
            n = n >> 1;
        }
        return true;
    }
}
// 110