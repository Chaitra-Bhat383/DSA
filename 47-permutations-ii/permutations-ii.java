class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        Arrays.sort(nums);
        recurPermute(nums, ds, ans, freq);
        return ans;
    }

    public void recurPermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        if(ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0; i < nums.length; ++i) {
            if(!freq[i]) {
                ds.add(nums[i]);
                freq[i] = true;
                recurPermute(nums, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
                while(i+1<nums.length && nums[i]==nums[i+1])i++;
            }
        }
    }
}