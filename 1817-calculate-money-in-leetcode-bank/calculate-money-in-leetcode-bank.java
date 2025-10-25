class Solution {
    public int totalMoney(int n) {
        int whole = n / 7;
        int copy = whole;
        int ans1 = 0;
        while (copy > 0) {
            ans1 = ans1 + 28 + 7 * (copy - 1);
            copy--;
        }
        int rem = n % 7;
        int ans2 = 0;
        while (rem > 0) {
            ans2 = ans2 + whole + 1;
            whole++;
            rem--;
        }
        return ans1 + ans2;
    }
}

// M T W T F S S
// 1 2 3 4 5 6 7 28
// 2 3 4 5 6 7 8 35 => 28 + 35 = 
// 3 4 5 6 7 8 9 42