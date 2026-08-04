class Solution {
    public boolean containsNumber(int number, int[] num) {
        for(int n : num) {
            if (n == number) return true;
        }
        return false;
    }

    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < n; ++i) {
            mini = Math.min(mini, nums[i]);
            maxi = Math.max(maxi, nums[i]);
        }

        for(int ele = mini; ele <= maxi; ++ele) {
            if(!containsNumber(ele, nums)) ans.add(ele);
        }

        return ans;
    }
}