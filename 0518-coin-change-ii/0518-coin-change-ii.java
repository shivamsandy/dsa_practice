class Solution {
    public int change(int amount, int[] coins) {
         
        int dp[][] =  new int [amount+1][coins.length];
        
        for(int i=0;i<amount+1;i++){
            for(int j=0;j<coins.length;j++){
                dp[i][j] =-1;
            }
        }
 

        return coin_change2_memo(coins, amount, coins.length-1,dp);
    }


     public static int coin_change2_memo(int coins[] ,int amount , int index,int dp[][]){
       
        if(amount==0){  
            return 1;
        }
        if(index<0){
            return 0; 
        }
        if(dp[amount][index]!=-1){
            return dp[amount][index];
        }

        int pick  =  0;

        if(coins[index]<=amount){
             pick  =  coin_change2_memo(coins, amount-coins[index], index,dp);
        }
        int no_pick  =  coin_change2_memo(coins, amount, index-1,dp);

        dp[amount][index] = pick +no_pick;

        return dp[amount][index];
    }   
}