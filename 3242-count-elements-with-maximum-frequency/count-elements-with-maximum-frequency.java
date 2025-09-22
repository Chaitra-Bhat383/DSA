class Solution {
    public int maxFrequencyElements(int[] nums) {
        // Map<Integer, Integer> mp = new HashMap<>();
        // int mx = 0, count = 0;

        // for (int num : nums) {
        //     mp.put(num, mp.getOrDefault(num, 0) + 1);
        // }
        // for (int val : mp.values()) {
        //     mx = Math.max(mx, val);
        // }
        // for (int val : mp.values()) {
        //     if (val == mx) {
        //         count++;
        //     }
        // }
        // return count * mx;

        Map<Integer, Integer> mp = new HashMap<>();
        int ans = 0, maxFreq = 0;
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
            int freq = mp.get(num);
            if(freq > maxFreq) {
                maxFreq = freq;
                ans = freq;
            } else if (freq == maxFreq) {
                ans = ans + freq;
            }
        }
        return ans;
    }
}