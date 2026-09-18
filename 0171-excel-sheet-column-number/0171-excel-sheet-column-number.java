class Solution {
    public int titleToNumber(String s) {
        int sum =  0;
        int count_power=1;

        for(int i=s.length()-1;i>=0;i--){
            char ch  =  s.charAt(i);
            int value = ch-'A'+1;
            if(count_power !=0){
                sum = sum + value * count_power;
                count_power =  count_power*26;

            }else{
                sum = ch-'A'+1;
                count_power++;
            }
        }
        return sum;
        
    }
}