class Solution {
    public boolean contains(int sum, int[] nums){
        for(int num : nums) {
            if (sum == num) return true;
        }
        return false;
    }
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for(int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] + 1 == nums[i + 1]) {
                // System.out.println(nums[i + 1]);
                sum += nums[i + 1];
            } else break;
        }
        while(contains(sum, nums)) {
            sum += 1;
        }
        return sum;
    }
}