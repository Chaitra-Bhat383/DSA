class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j <= i; ++j) {
                if (i == j) continue;
                swap(matrix, i, j);
            }
        }

        for(int i = 0; i < n; ++i) {
            int j = 0;
            while(j < n / 2) {
                swapp(matrix, i, j);
                j++;
            }
            // matrix[0][0] = matrix[0][2];
            // matrix[1][1] = matrix[1][1];
        }
    }

    public void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public void swapp(int[][] matrix, int i, int j) {
        int n = matrix.length;
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][n - j - 1];
        matrix[i][n - j - 1] = temp;
    }
}

/*
1 2 3     1 4 7
4 5 6     2 5 8
7 8 9     3 6 9

i, j => j, i
0 , 1 => 1, 0
*/