class Solution {
    public int countOdds(int low, int high) {
        int one = low % 2;
        int two = high % 2;
        if (one == 1 && two == 1) {
            return 2 + (high - low - 2) / 2;
        } else if (one == 0 && two == 0) {
            return (high - low) / 2;
        } else {
            return 1 + (high - low - 1) / 2;
        }
    }
}



// 1 2 3 4 5 6 7 8 9 10 11

// both are odd => 2/5 1/3 3/7 4/9
// 2n + 1 = ans
// (ans - 1) / 2 + 2

// both are even => 2/3 3/5 
// 2n - 1 = ans
// (ans + 1) / 2

// one odd one even => 1/2 2/4
// 2n = ans
// ans / 2 + 1

