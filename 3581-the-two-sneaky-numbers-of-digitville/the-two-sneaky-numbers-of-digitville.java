class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();
        for (int x : nums) {
            int c = count.getOrDefault(x, 0) + 1;
            count.put(x, c);
            if (c == 2) {
                res.add(x);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}

// sum = 6
// sarray = 2

// (n * (n+1) * (2n + 1))/6

// x2 + y2 = 12
// 16 - 2xy = 12
// x * y = 2
// x * (4 - x) = 2
// 4x - x2 = 2
// x2 - 4x + 2 = 0
// x + y = 4

// 0 1 2 3
// 0 1 1 0