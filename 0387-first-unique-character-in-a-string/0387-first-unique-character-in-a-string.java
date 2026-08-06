class Solution {
    public int firstUniqChar(String s) {

        
         HashMap<Character,Integer> map1  = count_char(s);
         for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(map1.get(c)==1){
                return i;
            }
        
         }
         return -1;
        
    }
      public static HashMap<Character,Integer> count_char(String s){
                                 
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i  =0;i <s.length();i++){

            char ch  =s.charAt(i);

            if(map.containsKey(ch)){

                int x =  map.get(ch);
            
                map.put(ch,  x+1);

            }else{
                map.put(ch, 1);
            }
        }
        return map;
    }
    
}
