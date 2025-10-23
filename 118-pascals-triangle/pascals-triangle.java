class Solution {
    public List<Integer> eachRow(int row) {
        List<Integer> eachRow = new ArrayList<>();
        eachRow.add(1);
        int ans = 1;
        for(int i = 1; i < row;++i) {
            ans = ans * (row - i);
            ans = ans / i;
            eachRow.add(ans);
        }
        return eachRow;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rowVal = new ArrayList<>();
        for(int i = 0; i < numRows; ++i) {
            rowVal.add(eachRow(i + 1));
        }
        return rowVal;
    }
}