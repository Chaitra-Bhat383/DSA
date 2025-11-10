class Solution {
    public int minOperations(int[] nums) {
        List<Integer> s = new ArrayList<>();
        int ans = 0;
        for (int n : nums) {
            while (!s.isEmpty() && s.get(s.size() - 1) > n) {
                s.remove(s.size() - 1);
            }
            if (n == 0) continue;
            if (s.isEmpty() || s.get(s.size() - 1) < n) {
                ans++;
                s.add(n);
            }
        }
        return ans;
    }
}