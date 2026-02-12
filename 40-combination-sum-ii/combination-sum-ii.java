class Solution {
    // TLE
    // public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    //     Arrays.sort(candidates);
    //     Set<List<Integer>> set = new HashSet<>();
    //     findCombination(0, candidates, target, set, new ArrayList<>());
    //     return new ArrayList<>(set);
    // }

    // public void findCombination(int ind, int[] arr, int target, Set<List<Integer>> set, List<Integer> ds) {
    //     if(ind == arr.length) {
    //         if(target == 0) {
    //             set.add(new ArrayList<>(ds));
    //         }
    //         return;
    //     }
    //     if(arr[ind] <= target) {
    //         ds.add(arr[ind]);
    //         findCombination(ind + 1, arr, target - arr[ind], set, ds);
    //         ds.remove(ds.size() - 1);
    //     }
    //     findCombination(ind + 1, arr, target, set, ds);
    // }

    public void findCombination(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if(target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = ind; i < arr.length; ++i) {
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;
            ds.add(arr[i]);
            findCombination(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}