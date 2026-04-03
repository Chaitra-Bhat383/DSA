class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = lowerBound(nums, target);
        int last = upperBound(nums, target) - 1;

        if(first == nums.length || nums[first] != target) return new int[]{-1, -1};

        return new int[]{first, last};
    }

    public int lowerBound(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if(nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public int upperBound(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if(nums[mid] > target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}