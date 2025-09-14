class Solution {
    HashSet<String> words_perfect;
    HashMap<String, String> words_case;
    HashMap<String, String> words_vowel;

    public String[] spellchecker(String[] wordlist, String[] queries) {
        words_perfect = new HashSet<>();
        words_case = new HashMap<>();
        words_vowel = new HashMap<>();

        for (String word : wordlist) {
            words_perfect.add(word);
            words_case.putIfAbsent(word.toLowerCase(), word);
            words_vowel.putIfAbsent(devowel(word.toLowerCase()), word);
        }

        String[] ans = new String[queries.length];
        int t = 0;
        for (String query : queries) {
            ans[t++] = solve(query);
        }
        return ans;
    }

    public String devowel(String word) {
        StringBuilder ans = new StringBuilder();
        for (char ch : word.toCharArray()) {
            ans.append(isVowel(ch) ? '*' : ch);
        }
        return ans.toString();
    }

    public boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public String solve(String query) {
        if (words_perfect.contains(query)) {
            return query;
        }

        if (words_case.containsKey(query.toLowerCase())) {
            return words_case.get(query.toLowerCase());
        }

        if (words_vowel.containsKey(devowel(query.toLowerCase()))) {
            return words_vowel.get(devowel(query.toLowerCase()));
        }

        return "";
    }
}