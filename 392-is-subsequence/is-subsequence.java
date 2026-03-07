class Solution {
    public boolean isSubsequence(String s, String t) {
        if ("".equals(s)) return true;

        boolean[][] dp = new boolean[s.length()][t.length()];
        for (int i = 0; i < s.length(); i++) {
            boolean found = (i == 0);
            char ch = s.charAt(i);

            for (int j = 0; j < t.length(); j++) {
                if (!found) { 
                    found = dp[i-1][j]; 
                    continue;
                }

                if (ch == t.charAt(j)) dp[i][j] = true;
                if (i+1 == s.length() && dp[i][j])  return true;
            }
        }

        return false;
    }
}

// abc
// ahbgdc

// dp[0][0] and dp[0][2] 