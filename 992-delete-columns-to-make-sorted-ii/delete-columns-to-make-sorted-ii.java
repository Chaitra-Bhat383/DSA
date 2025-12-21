class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int w = strs[0].length();
        int ans = 0;

        String[] cur = new String[n];
        for(int j = 0; j < w; ++j) {
            String[] cur2 = Arrays.copyOf(cur, n);
            for (int i = 0; i < n; ++i) {
                cur2[i] += strs[i].charAt(j);
            }
            if (isSorted(cur2)) {
                cur = cur2;
            } else {
                ans++;
            }
        }
        return ans;
    }

    public boolean isSorted(String[] A) {
        for (int i = 0; i < A.length - 1; ++i) {
            if (A[i].compareTo(A[i+1]) > 0) {
                return false;
            }
        }
        return true;
    }
}