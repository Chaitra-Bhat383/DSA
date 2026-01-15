class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);

        int h = 1, v = 1, hc = 1, vc = 1;
        for (int i = 1; i < hBars.length; ++i) {
            if(hBars[i] == hBars[i - 1] + 1) hc++;
            else hc = 1;
            h = Math.max(h, hc);
        }
        for (int i = 1; i < vBars.length; ++i) {
            if(vBars[i] == vBars[i - 1] + 1) vc++;
            else vc = 1;
            v = Math.max(v, vc);
        }
        int len = Math.min(h, v) + 1;
        return len * len;
    }
}