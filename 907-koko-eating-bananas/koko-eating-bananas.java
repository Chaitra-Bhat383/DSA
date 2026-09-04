class Solution {
    public int maxVal(int[] piles) {
        int maxi = Integer.MIN_VALUE;
        for(int pile : piles) {
            if(pile > maxi) maxi = pile;
        }
        return maxi;
    }

    public boolean ifPossible(int[] piles, int num, int h) {
        int ans = 0;
        for(int i = 0; i < piles.length; ++i) {
            ans += Math.ceil((double) piles[i] / (double) num);
        }
        return ans <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maxVal(piles);
        while(low <= high) {
            int mid = (low + high) / 2;
            if(ifPossible(piles, mid, h)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}