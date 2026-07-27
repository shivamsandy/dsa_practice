class Solution {
    public int numberOfSpecialChars(String s) {
        HashSet<Character> set  =  new HashSet<>();
        int count =0;

        for(int i=0;i<s.length();i++){
            char ch  =  s.charAt(i);
           set.add(ch);
        }
        
        for (char ch = 'a'; ch <= 'z'; ch++) {
    if (set.contains(ch) && set.contains(Character.toUpperCase(ch))) {
        count++;
    }
}
return count;
        
    }
}