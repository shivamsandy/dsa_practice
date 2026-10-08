class Solution {
    public boolean isSumEqual(String    s1, String s2, String target) {

       return num(s1) + num(s2) == num(target);  
    }

    public  static  int num(String s){
        StringBuilder sb  =  new StringBuilder();
        
        for(int i =0;i<s.length();i++){
            char ch  =  s.charAt(i);
            sb.append(ch-'a');
        }
        
        int num  =  Integer.parseInt(sb.toString());
        
        return num;
    }
    
    public  static  boolean construct(int sum,String target){
        
        StringBuilder sb  =  new StringBuilder();
        String s  =  String.valueOf(sum);

        for (int i = 0; i < s.length(); i++) {
         int digit = s.charAt(i) - '0';
            char ch = (char)(digit + 'a');
            sb.append(ch);
        }

        return  sb.toString().equals(target);
    }
    
}