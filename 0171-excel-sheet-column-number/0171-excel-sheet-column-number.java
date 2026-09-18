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

            } 
        }
        return sum;
        
    }
    //   int result = 0;
    //     for (int i = 0; i < columnTitle.length(); i++) {

    //         int value = columnTitle.charAt(i) - 'A' + 1;

    //         result = result * 26 + value;
    //     }
}