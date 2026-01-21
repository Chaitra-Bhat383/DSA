class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int x = nums.get(i);
            int res = -1;
            int d = 1;
            while ((x & d) != 0) {
                //System.out.println(x);
                res = x - d;
                //System.out.println(res);
                d <<= 1;
                //System.out.println(d);
            }
            result[i] = res;
        }
        return result;
    }
}