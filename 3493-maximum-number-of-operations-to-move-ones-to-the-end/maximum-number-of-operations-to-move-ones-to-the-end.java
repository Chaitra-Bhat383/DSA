class Solution {
    public int maxOperations(String s) {
        int countOfOne = 0;
        int ans = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '0') {
                while (i + 1 < s.length() && s.charAt(i + 1) == '0') {
                    i++;
                }
                ans += countOfOne;
            } else {
                countOfOne++;
            }
            i++;
        }
        return ans;
    }
}
