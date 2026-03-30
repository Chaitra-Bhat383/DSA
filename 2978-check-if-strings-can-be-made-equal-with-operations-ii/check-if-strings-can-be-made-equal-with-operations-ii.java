class Solution {
    public boolean checkStrings(String s1, String s2) {
        char[] even1 = new char[s1.length()/2 + 1];
        char[] even2 = new char[s2.length()/2 + 1];
        char[] odd1 = new char[s1.length()/2 + 1];
        char[] odd2 = new char[s2.length()/2 + 1];
        int j = 0, k = 0;
        for(int i = 0; i < s1.length(); ++i) {
            if(i % 2 == 0) {
                even1[j] = s1.charAt(i);
                j++;
            } else {
                odd1[k] = s1.charAt(i);
                k++;
            }
        }
        j = 0;
        k = 0;
        for(int i = 0; i < s2.length(); ++i) {
            if(i % 2 == 0) {
                even2[j] = s2.charAt(i);
                j++;
            } else {
                odd2[k] = s2.charAt(i);
                k++;
            }
        }
        Arrays.sort(even1);
        Arrays.sort(even2);
        Arrays.sort(odd1);
        Arrays.sort(odd2);
        return Arrays.equals(even1, even2) && Arrays.equals(odd1, odd2);
    }
}
