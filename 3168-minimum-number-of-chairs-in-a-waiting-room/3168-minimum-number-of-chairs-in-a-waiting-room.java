class Solution {
    public int minimumChairs(String s) {
 


        int max_cahir =0;

        int count =0;
        for(char ch  : s.toCharArray() ){
            if(ch =='E'){
                count +=1;
                max_cahir = Math.max(max_cahir, count);
            }else{
                count -=1;
            }
        }
        return max_cahir;


        
    }
    
}

        
    
