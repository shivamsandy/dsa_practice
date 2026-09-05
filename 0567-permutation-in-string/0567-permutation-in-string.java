class Solution {
    public boolean checkInclusion(String s1, String s2) {
         int freq1[] =  new int[26];
        int freq2[] =  new int[26];

        boolean flag  =  false;

        int k = s1.length();
        int n  =  s2.length();
        for(char ch  : s1.toCharArray()){
            freq1[ch-'a'] +=1;
        }

        for(int i =0;i<n;i++){
            char ch  =s2.charAt(i);
            freq2[ch-'a'] +=1;
            if(i>=k){
                freq2[s2.charAt(i-k)-'a'] -=1;
            }
            if(i>=k-1){
                if(Arrays.equals(freq1, freq2)){
                    flag =  true;
                }
            }

        }
    return flag;
        
    }
}