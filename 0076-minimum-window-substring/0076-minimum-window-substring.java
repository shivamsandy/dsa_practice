        // thinking easy hai coding is quit difficut to strt 

class Solution {
    public String minWindow(String s, String t) {

        int map_s[] =  new int[256];
        int map_t[] =  new int[256];
        for (char ch : t.toCharArray())
            map_t[ch]++;  //  this will work buddy

        int left  = 0;
        // int right  =0;
        int minlength  = Integer.MAX_VALUE;
        int min_strt  =  0;

        for(int right =0;right<s.length();right++){

            map_s[s.charAt(right)]++;

            while(check_maps(map_s,map_t)){

                int current_length  =  right-left  +1;

                if(current_length<minlength){
                    minlength  =  current_length;
                    min_strt  =  left;
                }
                map_s[s.charAt(left)]--;
                left++;
            }
        }



    return (minlength==Integer.MAX_VALUE) ?"" :  s.substring(min_strt, min_strt + minlength);


        
    }


     public static boolean check_maps(int[] map_s, int map_t[]) {
        for (int i = 0; i < 256; i++) {
            if (map_t[i] > map_s[i]) {
                return false;
            }
        }
        return true;
    }
}