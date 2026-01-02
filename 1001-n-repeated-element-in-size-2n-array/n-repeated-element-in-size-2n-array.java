class Solution {
    public int repeatedNTimes(int[] nums) {
        int count = nums.length / 2;
        Map<Integer, Integer> mp = new HashMap();
        for (int num : nums) {
            if (mp.getOrDefault(num, 0) >= 1) return num;
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        throw null;
    }
}