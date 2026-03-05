class Solution {
    public int minOperations(String s) {
        int ans1 = 0, ans2 = 0;
        for(int i = 0; i < s.length(); ++i) {
            if(i % 2 == 0 && s.charAt(i) != '0') ans1++;
            if(i % 2 == 1 && s.charAt(i) != '1') ans1++;
        }
        for(int i = 0; i < s.length(); ++i) {
            if(i % 2 == 0 && s.charAt(i) != '1') ans2++;
            if(i % 2 == 1 && s.charAt(i) != '0') ans2++;
        }
        return Math.min(ans1, ans2);
    }
}

// 0 1 0 1 0
// 1 0 1 0 1

// 0 1 0 0 1