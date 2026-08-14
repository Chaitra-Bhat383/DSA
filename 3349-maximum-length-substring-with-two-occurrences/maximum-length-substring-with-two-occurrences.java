class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int cnt = 0, ans = 0;
        int index = 0;
        for(int i = 0; i < s.length(); ++i) {
            if(mp.getOrDefault(s.charAt(i), 0) < 2) {
                mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
                cnt++;
            } else {
                while(index < i && s.charAt(i) != s.charAt(index)) {
                    mp.put(s.charAt(index), mp.getOrDefault(s.charAt(index), 0) - 1);
                    index++;
                    cnt--;
                }
                index++;
            }
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}