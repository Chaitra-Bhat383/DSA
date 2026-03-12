class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        int res = 0;
        boolean hasOdd = false;
        for(int each : hm.values()) {
            if(each % 2 == 0) {
                res += each;
            } else {
                res += each - 1;
                hasOdd = true;
            }
        }
        if(hasOdd) return res + 1;
        return res;
    }
}

// aaab