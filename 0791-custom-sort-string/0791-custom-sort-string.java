class Solution {
    public String customSortString(String order, String str) {

    //       char[] arr  = str.toCharArray();
    //     String s  =  new String(arr);
    //     System.out.println(s);
    //     int k = 0;   
    //     for(int i=0;i<s.length();i++){

    //         char matching_ch =  order.charAt(k);
    //         char curr_ch = s.charAt(i);
    //         if(matching_ch== curr_ch){
    //            s = swap(arr,k,i);
    //             k++;
    //         }
    //     }
    //     return s;
    // }
    //     public  static  String  swap (char[] arr ,int i ,int j){
    //     char temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] =temp;

    //     return new String(arr);

       StringBuilder st  =  new StringBuilder("");

        HashMap<Character,Integer> map  =  new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch  =  str.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);

        for(int i=0;i<order.length();i++){
            char ch  =  order.charAt(i);
            if(map.containsKey(ch)){
                while(map.get(ch)>0){
                    st.append(ch);
                    map.put(ch, map.get(ch) - 1);
                }
                map.remove(ch);
            }
        }

        System.out.println(st);

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            char key  =  entry.getKey();
            int value  =  entry.getValue();
            while(value>0){
                st.append(key);
               value--;
            }
        }
        return st.toString();
    }
    
}