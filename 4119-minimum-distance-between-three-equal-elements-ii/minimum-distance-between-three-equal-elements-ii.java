class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> mp = new HashMap<>();
        int ans = nums.length + 1;

        for(int i = 0; i < nums.length; ++i) {
            mp.putIfAbsent(nums[i], new ArrayList<>());
            List<Integer> list = mp.get(nums[i]);
            list.add(i);
            if (list.size() >= 3) {
                int k = list.size();
                int dist = list.get(k - 1) - list.get(k - 3);
                ans = Math.min(ans, dist);
            }
        }

        return ans == nums.length + 1 ? -1 : ans * 2;
    }
}