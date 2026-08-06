class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<Character,Integer> map1  = count_char(s);
         HashMap<Character,Integer> map2  = count_char(t);

         return map1.equals(map2);
        
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