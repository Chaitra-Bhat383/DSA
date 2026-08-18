class Solution {
    public int largestInteger(int[] nums, int k) {
        if (k == 1) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int x : nums)  map.put(x, map.getOrDefault(x, 0) + 1);
            int mx = -1;
            for (int x : nums) {
                if (map.get(x) == 1) mx = Math.max(mx, x);
            }
            return mx;
        }
        int one = nums[0];
        int two = nums[nums.length - 1];
        int mx = Math.max(one, two);
        for(int i = 1; i < nums.length - 1; ++i) {
            mx = Math.max(mx, nums[i]);
            if(nums[i] == one && nums[i] == two) {
                one = -1;
                two = -1;
            }
            else if(nums[i] == one) one = -1;
            else if(nums[i] == two) two = -1;
        }
        if(k == nums.length) return mx;
        else if(one == two) return -1;
        else return Math.max(one, two);
    }
}