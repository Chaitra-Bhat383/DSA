class Solution {
    public static List<String> construct(char board[][]) {
        List<String> res = new ArrayList<>();
        for(int i = 0; i < board.length; i++) {
            String str = new String(board[i]);
            res.add(str);
        }
        return res;
    }

    public static void solve(int col, char[][] board, int n, List<List<String>> ans, int leftRow[], int lowerDiagonal[], int upperDiagonal[]){
        if(col==n){
            ans.add(construct(board));
            return;
        }
        for(int row = 0; row < n; row++) {
            if(leftRow[row] ==0 && lowerDiagonal[row+col] == 0 && upperDiagonal[(n-1)+row-col] == 0) {
                leftRow[row] = 1;
                lowerDiagonal[row+col] = 1;
                upperDiagonal[(n-1)+row-col] = 1;
                board[row][col] = 'Q';
                solve(col+1, board, n, ans, leftRow, lowerDiagonal, upperDiagonal);
                leftRow[row] = 0;
                lowerDiagonal[row+col] = 0;
                upperDiagonal[(n-1)+row-col] = 0;
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j]='.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        int[] leftRow = new int[n];
        int[] lowerDiagonal = new int[2*n-1];
        int[] upperDiagonal = new int[2*n-1];
        solve(0, board, n, ans, leftRow, lowerDiagonal, upperDiagonal);
        return ans;
    }
}

