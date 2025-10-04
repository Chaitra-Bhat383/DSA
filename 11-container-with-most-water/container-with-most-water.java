class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int ans = 0;
        int left = 0, right = n - 1;
        while (left < right) {
            int width = right - left;
            int currH = Math.min(height[left], height[right]);
            int water = width * currH;
            ans = Math.max(ans, water);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}