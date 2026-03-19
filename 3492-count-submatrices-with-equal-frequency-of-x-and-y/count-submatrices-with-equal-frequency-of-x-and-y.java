class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] cols = new int[m];
        int[] xCols = new int[m];
        int res = 0;
        for(int i = 0; i < n; ++i) {
            int rows = 0;
            int xCount = 0;
            for(int j = 0; j < m; ++j) {
                int val = 0;
                if (grid[i][j] == 'X') val = 1;
                else if (grid[i][j] == 'Y') val = -1;
                cols[j] += val;
                rows += cols[j];
                if (grid[i][j] == 'X') xCols[j] += 1;
                xCount += xCols[j];
                if (rows == 0 && xCount > 0) {
                    res++;
                }
            }
        }
        return res;
    }
}