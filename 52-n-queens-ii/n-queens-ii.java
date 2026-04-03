class Solution {
    public int totalNQueens(int n) {
        int count = 0;
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j]='.';
            }
        }
        int[] leftRow = new int[n];
        int[] lowerDiagonal = new int[2*n-1];
        int[] upperDiagonal = new int[2*n-1];
        return solve(0, board, n, leftRow, lowerDiagonal, upperDiagonal, count);
    }

    public static int solve(int col, char[][] board, int n, int leftRow[], int lowerDiagonal[], int upperDiagonal[], int count){
        if(col==n){
            count++;
            return count;
        }
        for(int row = 0; row < n; row++) {
            if(leftRow[row] ==0 && lowerDiagonal[row+col] == 0 && upperDiagonal[(n-1)-row+col] == 0) {
                leftRow[row] = 1;
                lowerDiagonal[row+col] = 1;
                upperDiagonal[(n-1)-row+col] = 1;
                board[row][col] = 'Q';
                count = solve(col+1, board, n, leftRow, lowerDiagonal, upperDiagonal, count);
                leftRow[row] = 0;
                lowerDiagonal[row+col] = 0;
                upperDiagonal[(n-1)-row+col] = 0;
                board[row][col] = '.';
            }
        }
        return count;
    }
}