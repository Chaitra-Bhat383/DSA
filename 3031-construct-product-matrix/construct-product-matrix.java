class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int MOD = 12345;
        int[][] p = new int[grid.length][grid[0].length];
        long suffix = 1;
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                p[i][j] = (int) suffix;
                suffix = (suffix * grid[i][j]) % MOD;
            }
        }
        long prefix = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                p[i][j] = (int) (((long) p[i][j] * prefix) % MOD);
                prefix = (prefix * grid[i][j]) % MOD;
            }
        }
        return p;
    }
}

/*
1 2
3 4
*/