class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        func(0, nums, ans, ds);
        return ans;
    }

    public void func(int ind, int[] arr, List<List<Integer>> ans, List<Integer> ds) {
        if(ind >= arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[ind]);
        func(ind + 1, arr, ans, ds);
        ds.remove(ds.size() - 1);
        func(ind + 1, arr, ans, ds);
    }
}