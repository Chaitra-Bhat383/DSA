class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int maxi = nums[nums.length - 1];
        if (nums.length != maxi + 1) return false;
        int i = 0;
        while(i <= nums.length - 2) {
            if(i + 1 != nums[i]) return false;
            i++;
        }
        return true;
    }
}