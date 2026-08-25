class Solution {
    public boolean contains(int[] nums, int k) {
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] == k) return true;
        }
        return false;
    }

    public int missingMultiple(int[] nums, int k) {
        int num = k;
        while(contains(nums, k)) k += num;
        return k;
    }
}