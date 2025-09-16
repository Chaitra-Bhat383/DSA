class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        LinkedList<Integer> stack = new LinkedList<>();

        for (int num : nums) {
            stack.add(num);

            while (stack.size() > 1) {
                int a = stack.getLast();
                int b = stack.get(stack.size()-2);
                int g = gcd(a,b);
                if (g == 1) {
                    break;
                }
                stack.removeLast();
                stack.removeLast();
                stack.add(lcm(a, b, g));
            }
        }
        return stack;
    }

    public int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public int lcm(int a, int b, int g) {
        return (int)((long)a / g * b); 
    }
}