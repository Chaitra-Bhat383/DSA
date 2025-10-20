class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for(int i = 0; i < operations.length; ++i) {
            String op = operations[i];
            char ch = op.charAt(1);
            if (ch == '-') {
                res = res - 1;
            } else {
                res = res + 1;
            }
        }
        return res;
    }
}