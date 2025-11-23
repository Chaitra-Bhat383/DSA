class Solution {
    public int maxSumDivThree(int[] nums) {
        int total = 0;
        int smallest_one = Integer.MAX_VALUE;
        int smallest_two = Integer.MAX_VALUE;
        for (int n : nums) {
            total += n;
            if (n % 3 == 1) {
                smallest_two = Math.min(smallest_two, smallest_one == Integer.MAX_VALUE ? Integer.MAX_VALUE : smallest_one + n);
                smallest_one = Math.min(smallest_one, n);
            }
            if (n % 3 == 2) {
                smallest_one = Math.min(smallest_one, smallest_two == Integer.MAX_VALUE ? Integer.MAX_VALUE : smallest_two + n);
                smallest_two = Math.min(smallest_two, n);
            }
        }
        if (total % 3 == 0) {
            return total;
        } else if (total % 3 == 1) {
            return total - smallest_one;
        } else if (total % 3 == 2) {
            return total - smallest_two;
        }
        return 0;
    }
}