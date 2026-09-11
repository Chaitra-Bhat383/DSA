class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        int ans = 0;
        int even = 0, zero = 0;
        for(int digit : digits) {
            freq[digit]++;
        }
        for(int third = 1; third <= 9; ++third) {
            if(freq[third] == 0) continue;
            freq[third]--;
            for(int second = 0; second <= 9; ++second) {
                if(freq[second] == 0) continue;
                freq[second]--;
                for(int ones = 0; ones <= 8; ones += 2) {
                    if(freq[ones] != 0) ans++;
                }
                freq[second]++;
            }
            freq[third]++;
        }
        
        return ans;
    }
}