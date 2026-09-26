class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder ans = new StringBuilder();
        HashMap<String, String> map = new HashMap<>();
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }
        int start = -1;
        int end = -1;
        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == '(') start = i;
            else if(s.charAt(i) == ')') {
                end = i;
                String key = s.substring(start + 1, i);
                if (map.containsKey(key)) {
                    ans.append(map.get(key));
                } else {
                    ans.append("?");
                }
            } else if(end >= start){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}