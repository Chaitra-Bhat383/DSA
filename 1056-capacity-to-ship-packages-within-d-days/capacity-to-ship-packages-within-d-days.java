class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = 0;
        int max = 0;
        for(int w : weights){
            min = Math.max(min, w);
            max += w;
        }
        int ans = max;
        while(min <= max) {
            int mid = min + (max - min) / 2;
            long day = 1;
            int temp = mid;
            for(int weight : weights) {
                if (temp >= weight) {
                    temp -= weight;
                } else {
                    day++;
                    temp = mid - weight;
                }
            }

            if(day <= days) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return ans;
    }
}