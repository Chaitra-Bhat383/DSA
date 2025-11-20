class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] != b[1] ? a[1] - b[1] : b[0] - a[0]);
        int left = -1;
        int right = -1;
        int count = 0;
        for (int i = 0; i < intervals.length; ++i) {
            if (right < intervals[i][0]) {
                count += 2;
                left = intervals[i][1] - 1;
                right = intervals[i][1];
            } else if (left < intervals[i][0]) {
                count += 1;
                left = right;
                right = intervals[i][1];
            }
        }
        return count;
    }
}

// 1 2 3 4 5 6 => (1, 6)
//   2 3 4     => (2, 4)

// 1 2 3 4 5 6 7    => (1, 7)
//     3 4 5 6 7 8  => (3, 8)

// 1 2 => (1, 2)
// 1 2 3 4 5 => (1, 5)

// 1, 2 and 3, 4