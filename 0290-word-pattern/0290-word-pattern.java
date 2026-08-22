class Solution {
    public boolean wordPattern(String pattern, String s) {
         HashSet<String> set = new HashSet<>();
     String[] str = s.split(" ");

        HashMap<Character, String> map = new HashMap<>();

        if(str.length != pattern.length()) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String mapped_word = str[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(mapped_word)) {
                    return false;
                }
            } else if (set.contains(mapped_word)) {
                return false;
            }

            else {
                map.put(c, mapped_word);
                set.add(mapped_word);
            }

        }
        return true;

        
    }
}