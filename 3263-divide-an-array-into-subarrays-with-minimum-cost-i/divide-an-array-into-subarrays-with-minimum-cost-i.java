class Solution {
    public int minimumCost(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int[] modified = new int[nums.length - 1];
        for(int i = 1; i < nums.length; ++i) {
            modified[i-1] = nums[i];
        }
        Arrays.sort(modified);
        return nums[0] + modified[0] + modified[1];
    }
}