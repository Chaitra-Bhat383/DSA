class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int o = num / 3;
            int o1 = (3 * (o + 1)) - num;
            int o2 = num % 3;
            if (o1 < o2) {
                count += o1;
            } else {
                count += o2;
            }
        }
        return count;
    }
}