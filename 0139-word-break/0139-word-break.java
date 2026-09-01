class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {

        Boolean[] dp = new Boolean[s.length()];

        return word_break(s, wordDict, 0, dp);
    }

    public static boolean word_break(String s,
                                     List<String> wordDict,
                                     int index,
                                     Boolean[] dp) {

        if (index == s.length()) {
            return true;
        }

        if (dp[index] != null) {
            return dp[index];
        }

        for (int i = 0; i < wordDict.size(); i++) {

            String word = wordDict.get(i);

            if (s.startsWith(word, index)) {

                if (word_break(s, wordDict,
                               index + word.length(), dp)) {

                    dp[index] = true;
                    return true;
                }
            }
        }

        dp[index] = false;
        return false;
    }
}