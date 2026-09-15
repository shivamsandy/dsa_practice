class Solution {
    public int findNumbers(int[] nums) {
        
        int count =0;

        for(int i  =0 ;i<nums.length;i++){

            int number =  nums[i];

            int digitcount =0;
            while(number!=0){
                int ld  =  number %10;
                digitcount++;
                number= number/10;
            }

            if(digitcount%2==0){
                count++;
            }

        }
        return count;
        
    }
}