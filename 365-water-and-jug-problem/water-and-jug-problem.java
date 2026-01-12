class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if (x == y && y == target && target == x) return true;
        if (x + y < target) return false;
        while (x > 0 && y > 0) {
            if (Math.abs(x-y) != 0) {
                if(target % Math.abs(x-y) == 0){
                    return true;
                }
            }
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        return false;
    }
}

// 34
// 5
// 6