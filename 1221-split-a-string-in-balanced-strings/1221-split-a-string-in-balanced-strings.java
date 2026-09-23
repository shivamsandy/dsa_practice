class Solution {
    public int balancedStringSplit(String s) {
        int count =0;
        int left  =0;
        int right =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='R'){
                right++;
            }
             if(ch=='L'){
                left++;
            }
             if(right == left){
                count++;
            }
            

        }
        return count;
    }
}