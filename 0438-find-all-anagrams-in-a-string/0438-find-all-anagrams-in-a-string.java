class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        return anagram(s,p);
        
    }
    public static List<Integer> anagram(String s,String p){
        
        int k  = p.length();

        int freq1[] =  new int[26];
        int freq2[] =  new int[26];

        ArrayList<Integer> list  =  new ArrayList<>();


        for(Character ch  : p.toCharArray()){
            freq1[ch-'a'] +=1;
        }

       


        for(int i=0;i<s.length();i++){
            char ch  =  s.charAt(i);
            freq2[ch-'a'] +=1;
            
            if(i>=k){  // maintain a window
                freq2[s.charAt(i-k)-'a'] -=1;
            }
            
            if(i>=k-1){
                 if( Arrays.equals(freq1, freq2)){
                    list.add(i-k+1);
                }
            }
            
            
        }
        return list;

    }
}