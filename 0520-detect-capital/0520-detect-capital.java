class Solution {
    public boolean detectCapitalUse(String s) {
         int count =0;

        for(int i=0;i<s.length();i++){
            char ch  =s.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        if (count == s.length()) {
            return true;
        } else if (count == 1 && Character.isUpperCase(s.charAt(0))) {
            return true;
        } else if (count == 0) {
            return true;
        } else {
            return false;
        }
        
    }
}